package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstNumb = new String[n];
        String[] secondNumb = new String[n];

        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstNumb[i] = text[0];
                secondNumb[i] = text[1];
            }else {
                firstNumb[i] = text[1];
                secondNumb[i] = text[0];
            }
        }
        System.out.println(String.join(" ", firstNumb));
        System.out.println(String.join(" ", secondNumb));
    }
}

