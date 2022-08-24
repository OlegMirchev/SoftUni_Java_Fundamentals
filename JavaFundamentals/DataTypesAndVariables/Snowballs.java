package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbSnowballs = Integer.parseInt(scanner.nextLine());
        double highestSnowball = Double.NEGATIVE_INFINITY;
        int finalSnow = 0;
        int finalTime = 0;
        int finalQuality = 0;

        for (int i = 1; i <= numbSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double result = Math.pow((snowballSnow * 1.00 / (snowballTime)), snowballQuality);

            if (result > highestSnowball) {
                highestSnowball = result;
                finalSnow = snowballSnow;
                finalTime = snowballTime;
                finalQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", finalSnow, finalTime, highestSnowball, finalQuality);
    }
}
