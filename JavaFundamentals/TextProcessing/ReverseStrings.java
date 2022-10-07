package JavaFundamentals2021.TextProcessingLAB2107;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            StringBuilder word = new StringBuilder();
            word.append(command);
            word = word.reverse();

            System.out.println(command + " = " + word);

            command = scanner.nextLine();
        }
    }
}
