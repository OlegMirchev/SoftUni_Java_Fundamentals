package JavaFundamentals2021.ArraysLAB0405;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] item = value.split(" ");

        for (int i = item.length - 1; i >= 0; i--) {
            System.out.print(item[i] + " ");
        }
    }
}
