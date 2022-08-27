package JavaFundamentals2021.DataTypesMoreExersice;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb1 = Double.parseDouble(scanner.next());
        double numb2 = Double.parseDouble(scanner.next());
        double eps = 0.000001;
        double discount = 0.0;

        if (numb1 > numb2) {
            discount = numb1 - numb2;
        }else if (numb2 > numb1) {
            discount = numb2 - numb1;
        }
        if (eps > discount) {
            System.out.println("True");
        }else if (eps <= discount) {
            System.out.println("False");
        }
    }
}
