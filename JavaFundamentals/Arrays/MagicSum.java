package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
          .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumNumb = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int numb = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {

                if (sumNumb == numb + numbers[j]) {
                    System.out.println(numb + " " + numbers[j]);
                }
            }
        }
    }
}
