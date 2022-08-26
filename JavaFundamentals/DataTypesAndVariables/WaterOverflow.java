package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLitres = 0;

        for (int i = 1; i <= n; i++) {
            int litersWater = Integer.parseInt(scanner.nextLine());
            sumLitres += litersWater;

            if (sumLitres > 255) {
                System.out.println("Insufficient capacity!");
                sumLitres -= litersWater;
            }
        }
        System.out.println(sumLitres);
    }
}
