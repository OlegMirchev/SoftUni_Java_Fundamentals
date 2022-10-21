package JavaFundamentals2021.FinalExam;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] newCommand = command.split(">>>");
            switch (newCommand[0]) {
                case "Contains":
                    getContains(input ,newCommand[1]);
                    break;
                case "Flip":
                    getFlip(input, newCommand[1], newCommand[2], newCommand[3]);
                    System.out.println(input);
                    break;
                case "Slice":
                    getSlice(input, newCommand[1], newCommand[2]);
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", input);
    }

    private static void getContains(StringBuilder input, String command) {
        if (input.toString().contains(command)) {
            System.out.printf("%s contains %s%n", input, command);
        }else {
            System.out.println("Substring not found!");
        }
    }

    private static void getFlip(StringBuilder input, String upOrLow, String startIndex, String endIndex) {
        if (upOrLow.equals("Upper")) {
            for (int i = Integer.parseInt(startIndex); i < Integer.parseInt(endIndex); i++) {
                char symbol = input.charAt(i);
                input.deleteCharAt(i);
                input.insert(i, Character.toUpperCase(symbol));
            }
        }else if (upOrLow.equals("Lower")) {
            for (int i = Integer.parseInt(startIndex); i < Integer.parseInt(endIndex); i++) {
                char symbol = input.charAt(i);
                input.deleteCharAt(i);
                input.insert(i, Character.toLowerCase(symbol));
            }
        }
    }

    private static void getSlice(StringBuilder input, String startIndex, String endIndex) {
        input.delete(Integer.parseInt(startIndex), Integer.parseInt(endIndex));
    }
}
