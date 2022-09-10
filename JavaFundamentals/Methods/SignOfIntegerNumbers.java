package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        checkNumber(number);
    }

    private static void checkNumber(int newNumber) {
        if (newNumber > 0) {
            System.out.printf("The number %d is positive.", newNumber);
        }else if (newNumber < 0) {
            System.out.printf("The number %d is negative.", newNumber);
        }else {
            System.out.printf("The number %d is zero.", newNumber);
        }
    }
}
