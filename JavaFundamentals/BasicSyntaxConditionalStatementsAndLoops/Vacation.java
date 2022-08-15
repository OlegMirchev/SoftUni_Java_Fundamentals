package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.0;

        if (typeOfGroup.equals("Students")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
        }else if (typeOfGroup.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
        }else if (typeOfGroup.equals("Regular")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
        }
        double totalPrice = groupPeople * price;
        if (typeOfGroup.equals("Students") && groupPeople >= 30 && groupPeople < 100) {
            totalPrice *= 0.85;
        } else if (typeOfGroup.equals("Business") && groupPeople >= 100) {
            totalPrice = groupPeople - 10;
            totalPrice *= price;
        }else if (typeOfGroup.equals("Regular") && groupPeople >= 10 && groupPeople <= 20) {
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
