package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class PrintAndSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        do {
            System.out.print(start + " ");
            sum += start;
            start++;
        }while (start <= end);
        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}
