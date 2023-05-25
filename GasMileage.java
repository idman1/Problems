package ExercisesStartOver.Ch_four;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMile = 0;
        int totalGallon = 0;
        int counter = 1;

        while (true) {
            System.out.println("Enter mile driven (Enter - 1 when you have come to end of every trip)" + counter);
            int mile = scanner.nextInt();
            if (mile == -1) {
                break;
            } totalGallon += totalMile;
            System.out.println("Enter amount of gallon used for gallon for each tankful");
            int gallon = scanner.nextInt();
            if (gallon == -1) {
                break;
            }
            totalGallon += gallon;
            System.out.println(milePerGallon(mile, gallon));
            System.out.println();
            counter++;
        }
        if ( totalGallon != 0) {
            System.out.println(milePerGallon(totalMile, totalGallon));
        }
    }
    public static double milePerGallon(int mile, int gallon) {
        return  mile/gallon;
    }
}
