package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int area = printTriangleArea(width, length);
        System.out.println(area);
    }

    private static int printTriangleArea(int width, int length) {
        return width * length;


    }
}
