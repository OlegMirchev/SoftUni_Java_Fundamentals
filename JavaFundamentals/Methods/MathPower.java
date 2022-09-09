package JavaFundamentals2021.MethodsLAB0906;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double totalSum = printResult(numb,power);
        System.out.println(new DecimalFormat("0.####").format(totalSum));
    }

    private static double printResult(double numb, int power) {
        return Math.pow(numb,power);
    }
}
