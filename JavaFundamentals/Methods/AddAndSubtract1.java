package JavaFundamentals2021.MethodsExersice1106;

import java.util.Scanner;

public class AddAndSubtract1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());
        int number1 = printNumb1(numb1);
        int number2 = printNumb2(numb2);
        int number3 = printNumb3(numb3);
        int totalSum = (number1 + number2) - number3;
        System.out.println(totalSum);
    }

    private static int printNumb1(int numb1) {
        return numb1;
    }

    private static int printNumb2(int numb2) {
        return numb2;
    }

    private static int printNumb3(int numb3) {
        return numb3;
    }


}
