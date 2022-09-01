package JavaFundamentals2021.ArraysExersice0405;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text1 = scanner.nextLine().split(" ");
        String[] text2 = scanner.nextLine().split(" ");

        for (int i = 0; i < text2.length; i++) {
            String second = text2[i];
            for (int j = 0; j < text1.length; j++) {
                String first = text1[j];

                if (second.equals(first)) {
                    System.out.print(second + " ");
                }
            }
        }
    }
}
