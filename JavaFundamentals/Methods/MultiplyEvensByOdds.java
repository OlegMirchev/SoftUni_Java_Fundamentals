package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int evenOdd = printSumEvenOdd(Math.abs(number));
        System.out.println(evenOdd);
    }

    private static int printSumEvenOdd(int number) {
        int even = printSumEven(number);
        int odd = printSumOdd(number);
        return even * odd;
    }

    private static int printSumEven(int number) {
        int sumEven = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0){
                sumEven += digit;
            }
            number /= 10;
        }
        return sumEven;
    }

    private static int printSumOdd(int number) {
        int sumOdd = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 != 0){
                sumOdd += digit;
            }
            number /= 10;
        }
        return sumOdd;
    }
}
