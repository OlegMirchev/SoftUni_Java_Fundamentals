package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String products = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        printProducts(products, quantity);

    }

    private static void printProducts(String products, double quantity) {
        switch (products) {
            case "coffee":
                sumPrice(quantity, 1.50);
                break;
            case "water":
                sumPrice(quantity, 1.00);
                break;
            case "coke":
                sumPrice(quantity, 1.40);
                break;
            case "snacks":
                sumPrice(quantity, 2.00);
                break;
        }
    }

    private static void sumPrice(double quantity, double v) {
        System.out.printf("%.2f", quantity * v);
    }
}
