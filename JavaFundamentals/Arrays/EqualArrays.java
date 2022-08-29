package JavaFundamentals2021.ArraysLAB0405;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text1 = scanner.nextLine().split(" ");
        String[] text2 = scanner.nextLine().split(" ");
        int[] numbs1 = new int[text1.length];
        int[] numbs2 = new int[text2.length];
        int sumEqual = 0;
        boolean isValid = false;

        for (int i = 0; i < (text1.length + text2.length) - text1.length; i++) {
            numbs1[i] = Integer.parseInt(text1[i]);
            numbs2[i] = Integer.parseInt(text2[i]);

            if (numbs1[i] == numbs2[i]) {
                sumEqual += numbs1[i];
                isValid = true;
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.printf("Arrays are identical. Sum: %d", sumEqual);
        }
    }
}
