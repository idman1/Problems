package intergerLeed;

import java.util.Arrays;

public class FindLcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findLcm(10)));

    }

    public static int[] findLcm(int number) {
        int[] array = new int[number];
        int counter = 0;
        int index = 2;
            while (number > 1){
            if (number % index == 0) {
                number /= index;
                array[counter] = index;
                counter++;
            }else {
                index++;
            }
        }// return Arrays.copyOf(array,counter);
            int [] newArray = new int[counter];
        for (int i = 0; i < counter; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }



}
