package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "+":
                add(number1, number2);
                break;
            case "-":
                subtract(number1, number2);
                break;
            case "*":
                multiplies(number1, number2);
                break;
            case "/":
                divide(number1, number2);
                break;
        }
    }

    private static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void multiplies(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void divide(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
