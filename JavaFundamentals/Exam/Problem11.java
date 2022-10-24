package JavaFundamentals2021.FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder username = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] newCommand = command.split("\\s+");
            switch (newCommand[0]) {
                case "Letters":
                    getLetters(username, newCommand[1]);
                    break;
                case "Reverse":
                    getReverse(username, newCommand[1], newCommand[2]);
                    break;
                case "Substring":
                    getSubstring(username, newCommand[1]);
                    break;
                case "Replace":
                    getReplace(username, newCommand[1]);
                    break;
                case "IsValid":
                    getIsValid(username, newCommand[1]);
                    break;
            }


            command = scanner.nextLine();
        }
    }

    private static void getLetters(StringBuilder username, String upperLower) {
        if (upperLower.equals("Lower")) {
            for (int i = 0; i < username.length(); i++) {
                char symbol = username.charAt(i);
                username.deleteCharAt(i);
                username.insert(i, Character.toLowerCase(symbol));
            }
            System.out.println(username);

        } else if (upperLower.equals("Upper")) {
            for (int i = 0; i < username.length(); i++) {
                char symbol = username.charAt(i);
                username.deleteCharAt(i);
                username.insert(i, Character.toUpperCase(symbol));
            }
            System.out.println(username);
        }
    }

    private static void getReverse(StringBuilder username, String startIndex, String endIndex) {
        if (Integer.parseInt(startIndex) >= 0 && Integer.parseInt(endIndex) < username.length()) {
            StringBuilder reverse = new StringBuilder();
            for (int i = Integer.parseInt(startIndex); i <= Integer.parseInt(endIndex); i++) {
                char symbol = username.charAt(i);
                reverse.append(symbol);
            }
            reverse.reverse();
            System.out.println(reverse);
        }
    }

    private static void getSubstring(StringBuilder username, String subs) {
        StringBuilder substring = new StringBuilder();
        if (username.toString().contains(subs)) {
            substring.append(username.toString().replaceAll(subs, ""));
            username.delete(0, username.length());
            username.append(substring);
        } else {
            System.out.printf("The username %s doesn't contain %s.%n", username, subs);
        }
        System.out.println(username);
    }

    private static void getReplace(StringBuilder username, String symbol) {
        StringBuilder charAt = new StringBuilder();
        charAt.append(username.toString().replaceAll(symbol, "-"));
        username.delete(0, username.length());
        username.append(charAt);
        System.out.println(username);
    }

    private static void getIsValid(StringBuilder username, String letter) {
        boolean isValid = false;
        if (username.toString().contains(letter)) {
            isValid = true;
        }
        if (isValid) {
            System.out.println("Valid username.");
        }else {
            System.out.printf("%s must be contained in your username.%n", letter);
        }
    }
}

