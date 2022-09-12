package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result = printWord(word);
        System.out.println(result);
    }

    private static String printWord(String word) {
        String[] index = word.split("");
        String letter = "";
        if (word.length() % 2 == 0) {
            int symbolEven = index.length / 2;
            letter = index[symbolEven - 1] + index[symbolEven];
        }else {
            int symbolOdd = index.length / 2;
            letter = index[symbolOdd];
        }
        return letter;
    }
}
