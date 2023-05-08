package LeedCodeEasyTheyCall_ItNotMeO;

public class Palindrome {
    public static void main(String[] args) {
       // System.out.println(palindrome(123));
      //  patterns(4);
        //pattern2(123);
      //  System.out.println(pattern2(121));
        int [] arr = {9,2,3,2,6,6};
        System.out.println(firstUniqueNumber(arr));
    }

    private static boolean palindrome(int n) {
        if (n < 0 || n % 10 == 0 && n != 0){
            return false;
        }
        int reverse = 0;
        while (n > reverse) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return n == reverse || n == reverse / 10;
    }
    private static void patterns(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static boolean pattern2(int n){
            String str = Integer.toString(n);
            return str.equals(new StringBuilder(str).reverse().toString());

    }
    private static int firstUniqueNumber(int[] arr){
            int [] unique = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            unique[i] = arr[i];
        }
        return unique.length;
    }
}

