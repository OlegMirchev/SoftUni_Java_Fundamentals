package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isValid = false;

        for (int i = 0; i < numbers.length; i++) {
            int digit = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(digit);
                break;
            }
            for (int j = i + 1; j < numbers.length; j++) {

                if (digit > numbers[j]) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.print(digit + " ");
            }
        }
    }
}
