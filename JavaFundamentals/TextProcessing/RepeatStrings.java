package JavaFundamentals2021.TextProcessingLAB2107;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        for (String word : input) {
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word);
            }
        }
    }
}
