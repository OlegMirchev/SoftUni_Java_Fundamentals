package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(", ");


        for (String word : text) {
            if (getValid(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean getValid(String word) {
        if (!(word.length() > 3 && word.length() < 16)) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }
}
