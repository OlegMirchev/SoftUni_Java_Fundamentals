package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (i == text.length() - 1) {
                System.out.printf("%c", symbol);
                return;
            }
            char symbol1 = text.charAt(i + 1);
            String letterFirstPosition = String.valueOf(symbol);
            String letterSequencePosition = String.valueOf(symbol1);

            if (letterFirstPosition.equals(letterSequencePosition)) {
                continue;
            }
            System.out.print(letterFirstPosition);
        }
    }
}
