package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int vowel =  printCount(word);
        System.out.println(vowel);
    }

    private static int printCount(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a' || word.charAt(i) == 'e') || (word.charAt(i) == 'i' || word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u' || word.charAt(i) == 'A') || (word.charAt(i) == 'E' || word.charAt(i) == 'I') ||
                    (word.charAt(i) == 'O' || word.charAt(i) == 'U')) {

                count++;
            }
        }
        return count;
    }
}
