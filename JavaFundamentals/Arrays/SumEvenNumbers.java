package JavaFundamentals2021.ArraysLAB0405;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] item = value.split(" ");
        int[] arr = new int[item.length];
        int sumEven = 0;

        for (int i = 0; i < item.length; i++) {
            arr[i] = Integer.parseInt(item[i]);

            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
        }
        System.out.println(sumEven);
    }
}
