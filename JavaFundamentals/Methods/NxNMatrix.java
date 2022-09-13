package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        printHeight(n);

    }

    private static void printHeight(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
            printWidth(n);
        }
    }

    private static void printWidth(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
