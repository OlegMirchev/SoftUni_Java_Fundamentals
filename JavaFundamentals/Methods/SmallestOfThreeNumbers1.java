package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class SmallestOfThreeNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(scanner.nextLine());
        }
        int minNumber = smallestNumb(number);
        System.out.println(minNumber);
    }

    private static int smallestNumb(int[] number) {
        int min = Integer.MAX_VALUE;
        if (number[0] < min) {
            min = number[0];
        }
        if (number[1] < min) {
            min = number[1];
        }
        if (number[2] < min) {
            min = number[2];
        }
        return min;
    }
}
