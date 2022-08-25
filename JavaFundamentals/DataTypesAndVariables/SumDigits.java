package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumDigit = 0;

        while (number > 0) {
            sumDigit += number % 10;
            number /= 10;
        }
        System.out.println(sumDigit);
    }
}
