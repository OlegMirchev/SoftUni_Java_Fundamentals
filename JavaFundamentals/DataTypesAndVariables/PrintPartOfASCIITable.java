package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbol1 = Integer.parseInt(scanner.nextLine());
        int symbol2 = Integer.parseInt(scanner.nextLine());

        for (int i = symbol1; i <= symbol2; i++) {
            char letter1 = (char) i;
            System.out.print(letter1 + " ");
        }
    }
}
