package JavaFundamentals2021.TextProcessingLAB2107;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeLetter = scanner.nextLine();
        String code = scanner.nextLine();

        while (code.contains(removeLetter)) {
            code = code.replace(removeLetter, "");
        }
        System.out.println(code);
    }
}
