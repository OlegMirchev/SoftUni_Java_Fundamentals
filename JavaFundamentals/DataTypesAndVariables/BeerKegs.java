package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.NEGATIVE_INFINITY;
        String winnerKeg = "";

        for (int i = 1; i <= n; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double result = (Math.pow(radius,2) * Math.PI) * height;

            if (result > max) {
                max = result;
                winnerKeg = modelKeg;
            }
        }
        System.out.println(winnerKeg);
    }
}
