package JavaFundamentals2021.MidExam;

import ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.BikeRace;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> evenIntegers = Arrays.stream(scanner.nextLine().split("@")).collect(Collectors.toList());
        int index = 0;
        int lastPositions = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            String[] newCommand = command.split("\\s+");
            index += Integer.parseInt(newCommand[1]);
            if (index > evenIntegers.size() - 1) {
                for (int i = 0; i < evenIntegers.size(); i++) {
                    int number = Integer.parseInt(evenIntegers.get(i));
                    number -= 2;
                    evenIntegers.set(i, String.valueOf(number));
                    if (i >= lastPositions) {
                        lastPositions = i;
                    }
                    break;
                }
            }
                for (int i = 0; i < evenIntegers.size(); i++) {
                    if (i == index) {
                        int number = Integer.parseInt(evenIntegers.get(i));
                        number -= 2;
                        evenIntegers.set(i, String.valueOf(number));
                        if (i >= lastPositions) {
                            lastPositions = i;
                        }
                    }
                    if (Integer.parseInt(evenIntegers.get(i)) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", i);
                    }
                }


            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastPositions);

        if (evenIntegers.isEmpty()) {
            System.out.println("Mission was successful.%n");
        } else {
            int failed = 0;
            for (String result : evenIntegers) {
                if (Integer.parseInt(result) > 0) {
                    failed++;
                }
            }
            System.out.printf("Cupid has failed %d places.%n", failed);
        }
    }
}
