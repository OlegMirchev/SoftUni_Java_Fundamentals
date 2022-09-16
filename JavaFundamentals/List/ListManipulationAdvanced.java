package JavaFundamentals2021.ListsLAB1606;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        String command = scanner.nextLine();
        int sum = 0;

        while (!command.equals("end")) {
            String[] newCommand = command.split("\\s+");
            for (int i = 0; i < newCommand.length - 1; i++) {
                switch (newCommand[i]) {
                    case "Contains":
                        if (numbers.contains(Integer.parseInt(newCommand[i + 1]))) {
                            System.out.println("Yes");
                        }else {
                            System.out.println("No such number");
                        }
                        break;
                    case "Print":
                        if (newCommand[i + 1].equals("even")) {
                            int count = 0;
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) % 2 == 0) {
                                    System.out.print(numbers.get(j) + " ");
                                    count++;
                                }
                            }
                            if (count > 0) {
                                System.out.println();
                            }
                        }
                        else if (newCommand[i + 1].equals("odd")){
                            int count = 0;
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) % 2 != 0) {
                                    System.out.print(numbers.get(j) + " ");
                                    count++;
                                }
                            }
                            if (count > 0) {
                                System.out.println();
                            }
                        }
                        break;
                    case "Get":
                        if (newCommand[i + 1].equals("sum")) {
                            for (int j = 0; j < numbers.size(); j++) {
                                sum += numbers.get(j);
                            }
                            System.out.println(sum);
                        }
                        break;
                    case "Filter":
                        if (newCommand[i + 1].equals(">=")) {
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) >= Integer.parseInt(newCommand[i + 2])) {
                                    System.out.print(numbers.get(j) + " ");
                                }
                            }
                            System.out.println();
                        }
                        else if (newCommand[i + 1].equals("<")) {
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) < Integer.parseInt(newCommand[i + 2])) {
                                    System.out.print(numbers.get(j) + " ");
                                }
                            }
                            System.out.println();
                        }
                        else if (newCommand[i + 1].equals(">")) {
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) > Integer.parseInt(newCommand[i + 2])) {
                                    System.out.print(numbers.get(j) + " ");
                                }
                            }
                            System.out.println();
                        }
                        else if (newCommand[i + 1].equals("<=")) {
                            for (int j = 0; j < numbers.size(); j++) {
                                if (numbers.get(j) <= Integer.parseInt(newCommand[i + 2])) {
                                    System.out.print(numbers.get(j) + " ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
