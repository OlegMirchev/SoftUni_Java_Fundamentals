package JavaFundamentals2021.MapsLambdaStreamAPILAB1407;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = Arrays.stream(scanner.nextLine().split("\\s+")).filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);
        for (String result : fruits) {
            System.out.println(result);
        }
    }
}
