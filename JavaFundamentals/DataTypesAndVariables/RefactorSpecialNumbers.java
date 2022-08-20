package JavaFundamentals2021.DataTypesLAB2605;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int numb = 0;
        boolean isValid = false;
        for (int i = 1; i <= n; i++) {
            numb = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isValid = (sum == 5) || (sum == 7) || (sum == 11);
            String letter;
            if (isValid) {
                letter = "True";
            }else {
                letter = "False";
            }
            System.out.printf("%d -> %s%n", numb, letter);
            sum = 0;
            i = numb;
        }
    }
}
