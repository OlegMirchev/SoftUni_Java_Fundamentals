package JavaFundamentals2021.ArraysLAB0405;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        int[] numb = new int[text.length];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < text.length; i++) {
            numb[i] = Integer.parseInt(text[i]);

            if (numb[i] % 2 == 0) {
                sumEven += numb[i];
            }else {
                sumOdd += numb[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
