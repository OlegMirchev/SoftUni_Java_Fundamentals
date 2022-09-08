package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class GreaterOfTwoValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command) {
            case "int":
                int number1 = Integer.parseInt(scanner.nextLine());
                int number2 = Integer.parseInt(scanner.nextLine());
                getMaxInt(number1, number2);
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                getMaxChar(symbol1, symbol2);
                break;
            case "string":
                String word1 = scanner.nextLine();
                String word2 = scanner.nextLine();
                getMaxString(word1, word2);
                break;
        }
    }

    private static void getMaxInt(int number1, int number2) {
        if (number1 >= number2) {
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }
    }

    private static void getMaxChar(char symbol1, char symbol2) {
        if (symbol1 >= symbol2) {
            System.out.println(symbol1);
        }else {
            System.out.println(symbol2);
        }
    }

    private static void getMaxString(String word1, String word2) {
        if (word1.compareToIgnoreCase(word2) >= 0) {
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }
    }
}
