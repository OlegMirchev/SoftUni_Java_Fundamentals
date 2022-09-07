package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        result(command, number1, number2);
    }

    private static void result(String command, int number1, int number2) {
        switch (command) {
            case "add":
                add(command, number1, number2);
                break;
            case "multiply":
                multiply(command, number1, number2);
                break;
            case "subtract":
                subtract(command, number1, number2);
                break;
            case "divide":
                divide(command, number1, number2);
                break;
        }
    }

    private static void add(String add, int addNumber1, int addNumber2) {
        System.out.println(addNumber1 + addNumber2);
    }

    private static void multiply(String multiply, int addNumber1, int addNumber2) {
        System.out.println(addNumber1 * addNumber2);
    }

    private static void subtract(String subtract, int addNumber1, int addNumber2) {
        System.out.println(addNumber1 - addNumber2);
    }

    private static void divide(String divide, int addNumber1, int addNumber2) {
        System.out.println(addNumber1 / addNumber2);
    }
}
