package JavaFundamentals2021.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> statusPirateShip = Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> statusWarship = Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sumPirateShip = 0;
        int sumWarship = 0;

        while (!command.equals("Retire")) {
            String[] newCommand = command.split("\\s+");

            switch (newCommand[0]) {
                case "Fire":
                    printFire(statusWarship, newCommand);
                    break;
                case "Defend":
                    printDefend(statusPirateShip, newCommand);
                    break;
                case "Repair":
                    printRepair(statusPirateShip, newCommand);
                    break;
                case "Status":
                    printStatus(statusPirateShip, maximumHealth);
                    break;

            }
            command = scanner.nextLine();
        }
        for (Integer sectionWarship : statusWarship) {
            if (sectionWarship <= 0) {
                System.out.println("You lost! The pirate ship has sunken.");
                return;
            }
        }
        for (Integer sectionPirateShip : statusPirateShip) {
            if (sectionPirateShip <= 0) {
                System.out.println("You lost! The pirate ship has sunken.");
                return;
            }
        }

        for (Integer statusPirate : statusPirateShip) {
            sumPirateShip += statusPirate;
        }
        System.out.printf("Pirate ship status: %d%n", sumPirateShip);
        for (Integer statusWar : statusWarship) {
            sumWarship += statusWar;
        }
        System.out.printf("Warship status: %d", sumWarship);
    }

    private static void printFire(List<Integer> statusWarship, String[] newCommand) {
        int section = 0;
        if (Integer.parseInt(newCommand[1]) >= 0 && Integer.parseInt(newCommand[1]) < statusWarship.size()) {
           section = statusWarship.get(Integer.parseInt(newCommand[1]));
           section -= Integer.parseInt(newCommand[2]);
           statusWarship.remove(Integer.parseInt(newCommand[1]));
           statusWarship.add(Integer.parseInt(newCommand[1]), section);

        }
    }

    private static void printDefend(List<Integer> statusPirateShip, String[] newCommand) {
        if (Integer.parseInt(newCommand[1]) >= 0 && Integer.parseInt(newCommand[2]) >= 0 && Integer.parseInt(newCommand[1]) < statusPirateShip.size() && Integer.parseInt(newCommand[2]) < statusPirateShip.size()) {
            for (int i = Integer.parseInt(newCommand[1]); i <= Integer.parseInt(newCommand[2]); i++) {
                int section = 0;
                section = statusPirateShip.get(i);
                section -= Integer.parseInt(newCommand[3]);
                statusPirateShip.remove(statusPirateShip.get(i));
                statusPirateShip.add(i, section);
            }
        }
    }

    private static void printRepair(List<Integer> statusPirateShip, String[] newCommand) {
        int section = 0;
        if (Integer.parseInt(newCommand[1]) >= 0 && Integer.parseInt(newCommand[1]) < statusPirateShip.size()) {
            section = statusPirateShip.get(Integer.parseInt(newCommand[1]));
            section += Integer.parseInt(newCommand[2]);
            statusPirateShip.remove(Integer.parseInt(newCommand[1]));
            statusPirateShip.add(Integer.parseInt(newCommand[1]), section);
        }
    }

    private static void printStatus(List<Integer> statusPirateShip, int maximumHealth) {
        maximumHealth *= 0.20;
        int countRepair = 0;
        for (int i = 0; i < statusPirateShip.size(); i++) {
            if (statusPirateShip.get(i) < maximumHealth) {
                countRepair++;
            }
        }
        System.out.printf("%d sections need repair.%n", countRepair);
    }
}
