package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);
    }

    private static void printTriangle(int numb) {
        ceilDigit(numb);
        floorDigit(numb);
    }

    private static void ceilDigit(int numb) {
        for (int i = 1; i <= numb; i++) {
            printOneLine(i);
        }
    }

    private static void floorDigit(int numb) {
        for (int i = numb - 1; i >= 1; i--) {
            printOneLine(i);
        }
    }

    private static void printOneLine(int line) {
        for (int i = 1; i <= line; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
