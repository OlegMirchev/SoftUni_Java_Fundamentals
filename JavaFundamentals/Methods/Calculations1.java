package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class Calculations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(number1,number2);
                break;
            case "multiply":
                multiply(number1, number2);
                break;
            case "subtract":
                subtract(number1, number2);
                break;
            case "divide":
                divide(number1, number2);
                break;
        }
    }

    private static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void divide(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
