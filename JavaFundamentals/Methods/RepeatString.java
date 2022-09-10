package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String finalResult = printNewWord(word, n);
        System.out.println(finalResult);
    }

    private static String printNewWord(String word, int n) {
        String newWord = "";
        for (int i = 1; i <= n; i++) {
            newWord += word;
        }
        return newWord;

    }
}
