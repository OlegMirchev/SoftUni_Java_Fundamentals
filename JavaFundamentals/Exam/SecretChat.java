package JavaFundamentals2021.FinalExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] newCommand = command.split(":\\|:");
            switch (newCommand[0]) {
                case "InsertSpace":
                    getInsertSpace(message, Integer.parseInt(newCommand[1]));
                    break;
                case "Reverse":
                    getReverse(message, newCommand[1]);
                    break;
                case "ChangeAll":
                    getChangeAll(message, newCommand[1], newCommand[2]);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }

    private static void getInsertSpace(StringBuilder message, int space) {
        message.insert(space, " ");
        System.out.println(message);
    }

    private static void getReverse(StringBuilder message, String reverseOrder) {
        StringBuilder input = new StringBuilder(reverseOrder);
        if (message.toString().contains(reverseOrder)) {
            String output = message.toString().replaceFirst(Pattern.quote(reverseOrder), "");
            message.delete(0, message.length());
            message.append(output);
            input.reverse();
            message.append(input);
            System.out.println(message);
        }else {
            System.out.println("error");
        }
    }

    private static void getChangeAll(StringBuilder message, String old, String then) {
        String output = message.toString().replaceAll(old, then);
        message.delete(0, message.length());
        message.append(output);
        System.out.println(message);
    }
}
