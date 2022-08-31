package JavaFundamentals2021.ArraysLAB0405;

import java.util.Scanner;

public class ReverseArrayOfStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        for (int i = 0; i < text.length / 2; i++) {
            String keep = text[i];
            text[i] = text[text.length - i - 1];
            text[text.length - i - 1] = keep;
        }
        System.out.println(String.join(" ", text));
    }
}
