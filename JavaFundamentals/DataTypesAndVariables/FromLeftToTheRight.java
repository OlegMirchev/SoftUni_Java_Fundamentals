package JavaFundamentals2021.DataTypesMoreExersice;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            double numb1 = Double.parseDouble(scanner.next());
            double numb2 = Double.parseDouble(scanner.next());
            int sumDigit = 0;

            if (numb1 > numb2) {
                while (Math.abs(numb1) > 0) {
                    sumDigit += numb1 % 10;
                    numb1 /= 10;
                }
            }else if (numb2 > numb1) {
                while (Math.abs(numb2) > 0) {
                    sumDigit += numb2 % 10;
                    numb2 /= 10;
                }
            }else {
                while (Math.abs(numb1) > 0) {
                    sumDigit += numb1 % 10;
                    numb1 /= 10;
                }
            }
            System.out.println(Math.abs(sumDigit));
        }
    }
}
