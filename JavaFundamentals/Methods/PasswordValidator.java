package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean finalResult =  passwordIsValid(password);
        if (finalResult) {
            System.out.println("Password is valid");
        }
    }

    private static boolean passwordIsValid(String password) {
        boolean valid1 = pass6Between10Symbols(password);
        boolean valid2 = consistsOnlyOfLettersAndDigits(password);
        boolean valid3 = haveLeast2Digit(password);
        if (valid1 && valid2 && valid3) {
            return true;
        }
        return false;
    }

    private static boolean pass6Between10Symbols(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return false;
    }

    private static boolean consistsOnlyOfLettersAndDigits(String password) {
        if (password.matches("^[a-zA-Z0-9]*$")) {
            return true;
        }else {
            System.out.println("Password must consist only of letters and digits");
        }
        return false;
    }

    private static boolean haveLeast2Digit(String password) {
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                countDigit++;
            }
        }
        if (countDigit < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        return countDigit >= 2;
    }
}
