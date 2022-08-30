package JavaFundamentals2021.ArraysLAB0405;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numb = new int[n];

        for (int i = 0; i < n; i++) {
            numb[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numb.length - 1; i >= 0 ; i--) {
            System.out.print(numb[i] + " ");
        }
    }
}
