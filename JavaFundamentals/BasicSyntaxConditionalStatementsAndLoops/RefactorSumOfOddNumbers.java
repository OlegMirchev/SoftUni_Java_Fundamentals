package JavaFundamentals2021.BasicSyntaxLAB1905;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int result = i * 2 - 1;
            System.out.println(result);
            sum += result;
        }
        System.out.printf("Sum: %d", sum);
    }
}
