package JavaFundamentals2021.BasicSyntaxLAB1905.PBMoreExarsiceBasicSyntax;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalSpent = 0.0;
        boolean isValid = false;

        while (!command.equals("Game Time")) {
            String game = command;
            double price = 0.0;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    command = scanner.nextLine();
                    continue;
            }
            if (currentBalance < price) {
                System.out.println("Too Expensive");
                command = scanner.nextLine();
                continue;
            }
            currentBalance -= price;
            totalSpent += price;
            System.out.printf("Bought %s%n", game);
            if (currentBalance == 0) {
                isValid = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }

    }
}
