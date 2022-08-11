package JavaFundamentals2021.BasicSyntaxLAB1905;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i+=2) {
            System.out.println(i);
            sum += i;
            n++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
