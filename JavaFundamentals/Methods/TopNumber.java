package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean isValidDivisible8 = divisibleBy8(i);
            boolean isValidOddDigit = oneOddDigit(i);
            if (isValidDivisible8 && isValidOddDigit) {
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleBy8(int number) {
        int digitSum = 0;
        int oneDigit = 0;
        while (number > 0) {
            oneDigit = number % 10;
            digitSum += oneDigit;
            number /= 10;
        }
        return digitSum % 8 == 0;
    }

    private static boolean oneOddDigit(int number) {
        int oneDigit = 0;
        while (number > 0) {
            oneDigit = number % 10;
            if (oneDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
