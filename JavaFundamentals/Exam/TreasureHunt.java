package JavaFundamentals2021.MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        List<String> initialTreasureChest = Arrays.stream(value.split("\\|+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        List<String> stealElements = new ArrayList<>();
        double count = 0.0;

        while (!command.equals("Yohoho!")) {
            String[] newCommand = command.split("\\s+");
            switch (newCommand[0]) {
                case "Loot":
                    printLoot(initialTreasureChest, newCommand);
                    break;
                case "Drop":
                    printDrop(initialTreasureChest, newCommand);
                    break;
                case "Steal":
                    printSteal(initialTreasureChest, newCommand, stealElements);
                    Collections.reverse(stealElements);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < stealElements.size(); i++) {
            if (i == stealElements.size() - 1) {
                System.out.print(stealElements.get(i));
            }else {
                System.out.print(stealElements.get(i) + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < initialTreasureChest.size(); i++) {
            count += initialTreasureChest.get(i).length();
        }
        if (initialTreasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        }else {
            count /= initialTreasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", count);
        }
    }

    private static void printLoot(List<String> initialTreasureChest, String[] newCommand) {
        for (int i = 1; i < newCommand.length; i++) {
            if (initialTreasureChest.contains(newCommand[i])) {
                continue;
            }
            initialTreasureChest.add(0, newCommand[i]);
        }
    }

    private static void printDrop(List<String> initialTreasureChest, String[] newCommand) {
        if (Integer.parseInt(newCommand[1]) > 0 && Integer.parseInt(newCommand[1]) < initialTreasureChest.size()) {
            initialTreasureChest.add(initialTreasureChest.size(), initialTreasureChest.get(Integer.parseInt(newCommand[1])));
            initialTreasureChest.remove(Integer.parseInt(newCommand[1]));
        }
    }

    private static void printSteal(List<String> initialTreasureChest, String[] newCommand, List<String> stealElements) {
        int size = initialTreasureChest.size();
        if (size < Integer.parseInt(newCommand[1])) {
            for (int j = initialTreasureChest.size(); j > 0; j--) {
                stealElements.add(initialTreasureChest.get(initialTreasureChest.size() - 1));
                initialTreasureChest.remove(initialTreasureChest.size() - 1);
            }
        }else {
            for (int i = initialTreasureChest.size(); i > size - Integer.parseInt(newCommand[1]); i--) {
                stealElements.add(initialTreasureChest.get(initialTreasureChest.size() - 1));
                initialTreasureChest.remove(initialTreasureChest.size() - 1);
            }
        }
    }
}
