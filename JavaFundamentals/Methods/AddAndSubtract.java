package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());
        int totalSum = printSum(numb1, numb2, numb3);
        System.out.println(totalSum);
    }

    private static int printSum(int numb1, int numb2, int numb3) {
        int sum = 0;
        sum += (numb1 + numb2) - numb3;

        return sum;
    }
}
