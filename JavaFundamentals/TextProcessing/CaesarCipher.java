package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = (char) (text.charAt(i) + 3);
            word.append(symbol);
        }
        System.out.println(word);
    }
}
