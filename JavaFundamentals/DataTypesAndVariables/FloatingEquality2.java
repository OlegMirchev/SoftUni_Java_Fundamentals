package JavaFundamentals2021.DataTypesMoreExersice;

import java.util.Scanner;

public class FloatingEquality2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb1 = Double.parseDouble(scanner.next());
        double numb2 = Double.parseDouble(scanner.next());
        double eps = 0.000001;

        if (Math.abs(numb1 - numb2) < eps) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
