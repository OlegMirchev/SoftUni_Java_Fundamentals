package JavaFundamentals2021.DataTypesLAB2605;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;

        for (int i = 1; i <= n; i++) {
            int sumDigit = 0;
            int digit = i;
            String bool = "";

            while (digit > 0) {
                sumDigit += digit % 10;
                digit /= 10;
            }
            isValid = (sumDigit == 5 || sumDigit == 7 || sumDigit == 11);
            if (isValid) {
                bool = "True";
            }else {
                bool = "False";
            }
            System.out.printf("%d -> %s%n", i, bool);
        }
    }
}
