package JavaFundamentals2021.DataTypesMoreExersice;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String letter = "";
        String symbolToLetter = "";
        boolean isValid = false;

        for (int i = 1; i <= n; i++) {
            String symbol = scanner.nextLine();

            if (symbol.equals("(") || symbol.equals(")")) {
                symbolToLetter += symbol;
            }else {
                continue;
            }
            if (symbolToLetter.equals("()")) {
                letter += symbolToLetter;
                symbolToLetter = "";
                isValid = true;
            }else {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
