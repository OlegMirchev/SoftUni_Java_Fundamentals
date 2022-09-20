package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] newCommand = command.split("\\s+");
            switch (newCommand[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(newCommand[1]));
                    break;
                case "Insert":
                    if (printInsertIndex(numbers, Integer.parseInt(newCommand[2]))) {
                        numbers.add(Integer.parseInt(newCommand[2]), Integer.parseInt(newCommand[1]));
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (printRemoveIndex(numbers, Integer.parseInt(newCommand[1]))) {
                        numbers.remove(Integer.parseInt(newCommand[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (newCommand[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(newCommand[2]); i++) {
                            int currentNumb = numbers.get(0);
                            numbers.add(numbers.size(), currentNumb);
                            numbers.remove(numbers.get(0));
                        }
                    } else if (newCommand[1].equals("right")) {
                        for (int i = Integer.parseInt(newCommand[2]) - 1; i >= 0; i--) {
                            int currentNumb = numbers.get(numbers.size() - 1);
                            numbers.add(0, currentNumb);
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        numbers.forEach(result -> System.out.print(result + " "));
    }

    private static boolean printRemoveIndex(List<Integer> numbers, int numberRemove) {
        return numberRemove >= 0 && numberRemove <= numbers.size() - 1;
    }

    private static boolean printInsertIndex(List<Integer> numbers, int numberInsert) {
        return numberInsert >= 0 && numberInsert <= numbers.size() - 1;
    }
}
