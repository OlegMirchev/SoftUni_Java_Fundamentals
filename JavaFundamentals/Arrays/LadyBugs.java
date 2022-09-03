package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeField = Integer.parseInt(scanner.nextLine());
        int[] array = new int[sizeField];
        int[] ladybugIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int ladybugElements : ladybugIndexes) {
            if (ladybugElements >= 0 && ladybugElements <= array.length - 1) {
                array[ladybugElements] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] thingsString = command.split(" ");
            int ladyBugsFly = Integer.parseInt(thingsString[0]);
            String direction = thingsString[1];
            int flyLength = Integer.parseInt(thingsString[2]);
            if (ladyBugsFly >= 0 && ladyBugsFly <= array.length - 1 && array[ladyBugsFly] == 1) {
                array[ladyBugsFly] = 0;
                if (direction.equals("right")) {
                    ladyBugsFly += flyLength;
                    while (ladyBugsFly <= array.length - 1 && array[ladyBugsFly] == 1) {
                        ladyBugsFly += flyLength;
                    }
                    if (ladyBugsFly <= array.length - 1) {
                        array[ladyBugsFly] = 1;
                    }
                } else {
                    ladyBugsFly -= flyLength;
                    while (ladyBugsFly >= 0 && array[ladyBugsFly] == 1) {
                        ladyBugsFly -= flyLength;
                    }
                    if (ladyBugsFly >= 0) {
                        array[ladyBugsFly] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int result : array) {
            System.out.print(result + " ");
        }
    }
}

