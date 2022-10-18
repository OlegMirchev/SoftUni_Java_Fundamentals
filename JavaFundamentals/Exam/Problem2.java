package JavaFundamentals2021.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] newCommand = command.split("\\s+");
            switch (newCommand[0]) {
                case "Add":
                    printAdd(number, newCommand);
                    break;
                case "Remove":
                    printRemove(number, newCommand);
                    break;
                case "Replace":
                    printReplace(number, newCommand);
                    break;
                case "Collapse":
                    printCollapse(number, newCommand);
                    break;

            }
            command = scanner.nextLine();
        }
        number.forEach(result -> System.out.print(result + " "));
    }

    private static void printAdd(List<Integer> number, String[] newCommand) {
        number.add(number.size(), Integer.parseInt(newCommand[1]));
    }

    private static void printRemove(List<Integer> number, String[] newCommand) {
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) == Integer.parseInt(newCommand[1])) {
                number.remove(number.get(i));
                return;
            }
        }
    }

    private static void printReplace(List<Integer> number, String[] newCommand) {
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) == Integer.parseInt(newCommand[1])) {
                number.set(i, Integer.parseInt(newCommand[2]));
                return;
            }
        }
    }

    private static void printCollapse(List<Integer> number, String[] newCommand) {
        for (int i = 0; i < number.size(); i++) {
            if (Integer.parseInt(newCommand[1]) > number.get(i)) {
                number.remove(number.get(i));
                i--;
            }
        }
    }
}
