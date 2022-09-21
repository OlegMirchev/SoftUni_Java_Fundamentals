package JavaFundamentals2021.ObjectLAB2306;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        int numb = Integer.parseInt(String.valueOf(number));


        for (int i = numb - 1; i >= 1; i--) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println(number);
    }
}
