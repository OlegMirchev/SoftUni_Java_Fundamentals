package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class ReplaceRepeatingChars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                text.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(text);
    }
}
