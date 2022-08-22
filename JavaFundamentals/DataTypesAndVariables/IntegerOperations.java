package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());
        int numb4 = Integer.parseInt(scanner.nextLine());

        int result = ((numb1 + numb2) / numb3) * numb4;

        System.out.println(result);
    }
}
