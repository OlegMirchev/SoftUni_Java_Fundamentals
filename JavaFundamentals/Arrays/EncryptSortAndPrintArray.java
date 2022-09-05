package JavaFundamentals2021.ArraysMoreExeresice;

import java.lang.reflect.Array;
import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            sum = 0;
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);

                if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i' ||
                        symbol == 'A' || symbol == 'E' || symbol == 'O' || symbol == 'U' || symbol == 'I') {
                    sum += symbol * name.length();
                } else {
                    sum += symbol / name.length();
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int chars : numbers) {
            System.out.println(chars);
        }
    }
}


