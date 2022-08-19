package JavaFundamentals2021.DataTypesLAB2605;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        double metresToKilometres = number * 1.00 / 1000;

        System.out.printf("%.2f", metresToKilometres);
    }
}
