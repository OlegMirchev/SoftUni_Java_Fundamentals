package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String isValid = printPalindrome(command);
            if (command.equals(isValid)) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            command = scanner.nextLine();
        }
    }

    private static String printPalindrome(String command) {
        String finalReverseStringCommand = "";
        StringBuilder reverseCommand = new StringBuilder();
        reverseCommand.append(command);
        reverseCommand.reverse();
        finalReverseStringCommand += reverseCommand;

        return finalReverseStringCommand;
    }
}
