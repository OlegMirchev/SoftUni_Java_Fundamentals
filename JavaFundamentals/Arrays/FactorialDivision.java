package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        double totalSumFactorial = printFactorialNumb1ToNumb2(number1, number2);
        System.out.printf("%.2f", totalSumFactorial);

    }

    private static double printFactorialNumb1ToNumb2(double number1, double number2) {
        double totalSumNum1 = printFactorialNumb1(number1);
        double totalSumNum2 = printFactorialNumb2(number2);

        return totalSumNum1 / totalSumNum2;
    }

    private static double printFactorialNumb1(double number1) {
        double sumForNumb1 = 0.0;
        for (double i = number1 - 1; i >= 1; i--) {
            number1 *= i;
        }
        sumForNumb1 = number1;
        return sumForNumb1;
    }

    private static double printFactorialNumb2(double number2) {
        double sumForNumb2 = 0.0;
        for (double i = number2 - 1; i >= 1; i--) {
            number2 *= i;
        }
        sumForNumb2 = number2;
        return sumForNumb2;
    }
}
