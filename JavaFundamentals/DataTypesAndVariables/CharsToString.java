package JavaFundamentals2021.DataTypesLAB2605;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String combineChar = "";

        combineChar += line1 + line2 + line3;

        System.out.println(combineChar);
    }
}
