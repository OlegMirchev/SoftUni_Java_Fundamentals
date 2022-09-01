package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
          .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isValid = false;

        for (int i = 0; i < numbers.length; i++) {
            int sumLeft = 0;
            int sumLRight = 0;
            for (int indexLeft = 0; indexLeft <= i - 1; indexLeft++) {
                sumLeft += numbers[indexLeft];
            }
            for (int indexRight = i + 1; indexRight < numbers.length; indexRight++) {
                sumLRight += numbers[indexRight];
            }
            if (sumLeft == sumLRight) {
                isValid = true;
                System.out.println(i);
            }
        }
        if (!isValid) {
            System.out.println("no");
        }
    }
}
