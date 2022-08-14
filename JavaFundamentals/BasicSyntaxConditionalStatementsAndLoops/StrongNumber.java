package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int firstNumb = number;

        while (number != 0) {
            int lastDigit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }
            sum += factorial;
            number /= 10;
        }
        if (firstNumb == sum) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
