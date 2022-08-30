package JavaFundamentals2021.ArraysLAB0405;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        int[] numb = Arrays.stream(text)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numb) {
            if (number % 2 == 0) {
                sumEven += number;
            }else {
                sumOdd += number;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
