package JavaFundamentals2021.BasicSyntaxLAB1905;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());

        if (input >= 3) {
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
