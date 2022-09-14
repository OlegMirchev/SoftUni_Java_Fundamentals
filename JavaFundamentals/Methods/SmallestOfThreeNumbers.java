package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int totalResult = smallestNumber(number1, number2, number3);
        System.out.println(totalResult);
    }

    private static int smallestNumber(int number1, int number2, int number3) {
        int min = Integer.MAX_VALUE;
        if (number1 < min) {
            min = number1;
        }
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        return min;
    }
}
