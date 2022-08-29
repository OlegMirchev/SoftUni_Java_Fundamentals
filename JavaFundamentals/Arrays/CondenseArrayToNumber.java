package JavaFundamentals2021.ArraysLAB0405;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        int[] number = Arrays.stream(text)
                .mapToInt(Integer::parseInt).toArray();

        while (number.length > 1) {

            int[] con = new int[number.length - 1];

            for (int i = 0; i < con.length; i++) {
                con[i] += number[i] + number[i + 1];

            }
            number = con;
        }
        System.out.println(number[0]);
    }
}


