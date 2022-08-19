package JavaFundamentals2021.DataTypesLAB2605;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        BigDecimal exactSum  = new BigDecimal(0);


        for (int i = 1; i <= number; i++) {
            BigDecimal decimal = new BigDecimal(scanner.nextLine());
            exactSum  = exactSum.add(decimal);
        }
        System.out.println(exactSum);
    }
}
