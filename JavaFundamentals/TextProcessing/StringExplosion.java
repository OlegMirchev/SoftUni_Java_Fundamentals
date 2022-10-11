package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(">");
        int bomb = 0;
        int bombLeft = 0;

        for (int i = 0; i < input.length; i++) {
            if (Character.isDigit(input[i].charAt(0))) {
                bomb = Character.getNumericValue(input[i].charAt(0)) + bombLeft;
                if (input[i].length() >= bomb) {
                    input[i] = input[i].substring(bomb);
                }else {
                    bombLeft = bomb - input[i].length();
                    input[i] = "";
                }
            }
            if (i == input.length - 1) {
                System.out.print(input[i]);
            }else {
                System.out.print(input[i] + ">");
            }
        }
    }
}
