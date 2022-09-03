package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
          .mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxCount = 0;
        int digit = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    break;
                }else {
                    count++;

                    if (count > maxCount) {
                        maxCount = count;
                        digit = numbers[i];
                    }
                }
            }
        }
        for (int k = 0; k < maxCount; k++) {
            System.out.print(digit + " ");

        }
    }
}
