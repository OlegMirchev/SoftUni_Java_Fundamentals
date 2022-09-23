package JavaFundamentals2021.ObjectLAB2306;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numb1 = new BigInteger(scanner.nextLine());
        BigInteger numb2 = new BigInteger(scanner.nextLine());

        BigInteger bigInteger = numb1.add(numb2);

        System.out.println(bigInteger);
    }
}
