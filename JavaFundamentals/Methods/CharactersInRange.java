package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        betweenSymbols(symbol1, symbol2);
    }

    private static void betweenSymbols(char symbol1, char symbol2) {
        for (int i = symbol1 + 1; i < symbol2; i++) {
            System.out.printf("%c ", i);
        }
        if (symbol1 > symbol2) {
            for (int i = symbol2 + 1; i < symbol1; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
