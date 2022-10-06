package JavaFundamentals2021.TextProcessingLAB2107;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char symbolLetter = code.charAt(i);

            if (Character.isDigit(symbolLetter)) {
                digit.append(symbolLetter);
            }else if (Character.isAlphabetic(symbolLetter)) {
                letter.append(symbolLetter);
            }else {
                symbol.append(symbolLetter);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(symbol);
    }
}
