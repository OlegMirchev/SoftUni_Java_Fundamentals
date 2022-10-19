package JavaFundamentals2021.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] newCommand = command.split("\\s+");
            switch (newCommand[0]) {
                case "Urgent":
                    printUrgent(shoppingList, newCommand);
                    break;
                case "Unnecessary":
                    printUnnecessary(shoppingList, newCommand);
                    break;
                case "Correct":
                    printCorrect(shoppingList, newCommand);
                    break;
                case "Rearrange":
                    printRearrange(shoppingList, newCommand);
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            if (i == shoppingList.size() - 1) {
                System.out.print(shoppingList.get(i));
            }else {
                System.out.print(shoppingList.get(i) + ", ");
            }
        }
    }

    private static void printUrgent(List<String> shoppingList, String[] newCommand) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(newCommand[1])) {
                return;
            }
        }
        shoppingList.add(0, newCommand[1]);
    }

    private static void printUnnecessary(List<String> shoppingList, String[] newCommand) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(newCommand[1])) {
                shoppingList.remove(shoppingList.get(i));
            }
        }
    }

    private static void printCorrect(List<String> shoppingList, String[] newCommand) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(newCommand[1])) {
                shoppingList.set(i, newCommand[2]);
            }
        }
    }

    private static void printRearrange(List<String> shoppingList, String[] newCommand) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(newCommand[1])) {
                shoppingList.add(shoppingList.size(), newCommand[1]);
                shoppingList.remove(shoppingList.get(i));
            }
        }
    }
}
