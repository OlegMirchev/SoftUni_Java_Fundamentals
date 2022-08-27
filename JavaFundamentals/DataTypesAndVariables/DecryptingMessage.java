package JavaFundamentals2021.DataTypesMoreExersice;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 1; i <= n; i++) {
            String symbol = scanner.nextLine();
            char letter = (char) (symbol.charAt(0) + key);
            word += letter;
            
        }
        System.out.println(word);
    }
}
