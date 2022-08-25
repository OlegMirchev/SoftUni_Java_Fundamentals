package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumChars = 0;

        for (int i = 1; i <= n; i++) {
            String symbol = scanner.nextLine();
            char letter = symbol.charAt(0);
            sumChars += letter;
        }
        System.out.printf("The sum equals: %d", sumChars);
    }
}
