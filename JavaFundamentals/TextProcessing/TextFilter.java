package JavaFundamentals2021.TextProcessingLAB2107;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] key = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        String result = "";
        String letterRemove = "";

        for (String word : key) {
            letterRemove = word;
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                word = word.replace(symbol,  '*');
                result = word;
            }
            text = text.replace(letterRemove, result);
        }
        System.out.println(text);
    }
}
