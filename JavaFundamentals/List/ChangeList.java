package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbs = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] newCommand = command.split("\\s+");
            for (int i = 0; i < newCommand.length - 1; i++) {
                switch (newCommand[i]) {
                    case "Delete":
                        numbs.removeAll(Collections.singleton(Integer.parseInt(newCommand[1])));
                        break;
                    case "Insert":
                        numbs.add(Integer.parseInt(newCommand[2]), Integer.parseInt(newCommand[1]));
                        break;
                }
            }
            command = scanner.nextLine();
        }
        for (Integer listResult : numbs) {
            System.out.print(listResult + " ");
        }
    }
}
