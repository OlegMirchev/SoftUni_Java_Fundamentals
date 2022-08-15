package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0.0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.equals("Nuts")) {
                if (sum < 2) {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                    continue;
                }
                sum -= 2;
                System.out.printf("Purchased %s%n", command);
            } else if (command.equals("Water")) {
                if (sum < 0.7) {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                    continue;
                }
                sum -= 0.7;
                System.out.printf("Purchased %s%n", command);
            } else if (command.equals("Crisps")) {
                if (sum < 1.5) {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                    continue;
                }
                sum -= 1.5;
                System.out.printf("Purchased %s%n", command);
            } else if (command.equals("Soda")) {
                if (sum < 0.8) {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                    continue;
                }
                sum -= 0.8;
                System.out.printf("Purchased %s%n", command);
            } else if (command.equals("Coke")) {
                if (sum < 1) {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                    continue;
                }
                sum -= 1;
                System.out.printf("Purchased %s%n", command);
            } else {
                System.out.println("Invalid product");
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
