package JavaFundamentals2021.BasicSyntaxLAB1905;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 != 0) {
                System.out.println("Please write an even number.");
                continue;
            }else {
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            }

        }
    }
}
