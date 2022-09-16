package JavaFundamentals2021.ListsLAB1606;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] newCommand = command.split(" ");
            for (int i = 0; i < newCommand.length - 1; i++) {
                switch (newCommand[0]) {
                    case "Add":
                        numbers.add(numbers.size(), Integer.valueOf(newCommand[1]));
                        break;
                    case "Remove":
                        numbers.remove(Integer.valueOf(newCommand[1]));
                        break;
                    case "RemoveAt":
                        numbers.remove(numbers.get(Integer.parseInt(newCommand[1])));
                        break;
                    case "Insert":
                        numbers.add(Integer.parseInt(newCommand[2]), Integer.valueOf(newCommand[1]));
                        i++;
                        break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
