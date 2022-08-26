package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.printf("%c%c%c%n", (i + '`'), (j + '`'), (k + '`'));
                }
            }
        }
    }
}
