package JavaFundamentals2021.ArraysMoreExeresice;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numb = 0;
        System.out.println("1");

        for (int i = 1; i < n; i++) {
            numb = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(numb + " ");
                numb = numb * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
