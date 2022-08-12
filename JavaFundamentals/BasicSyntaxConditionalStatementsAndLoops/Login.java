package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String symbol = "";
        String password = "";
        int countBlog = 0;
        boolean isValid = false;

        for (int i = pass.length() - 1; i >= 0; i--) {
            char letter = pass.charAt(i);
            symbol += letter;
            password = pass;
        }
        pass = scanner.nextLine();
        while (!pass.equals(symbol)) {
            countBlog++;
            if (countBlog == 4) {
                isValid = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("User %s blocked!", password);
        }else {
            System.out.printf("User %s logged in.", password);
        }
    }
}
