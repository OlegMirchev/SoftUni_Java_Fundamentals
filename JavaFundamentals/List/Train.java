package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbWagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int numbersCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] newCommand = command.split("\\s+");
            if (newCommand[0].equals("Add")) {
                numbWagons.add(Integer.parseInt(newCommand[1]));
            }else {
                for (int i = 0; i < numbWagons.size(); i++) {
                    int currentDigit = Integer.parseInt(newCommand[0]);
                    if (numbWagons.get(i) + currentDigit <= numbersCapacity) {
                        numbWagons.set(i, numbWagons.get(i) + currentDigit);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        numbWagons.forEach(result -> System.out.print(result + " "));
    }
}
