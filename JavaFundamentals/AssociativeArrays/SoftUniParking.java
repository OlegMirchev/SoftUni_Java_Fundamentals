package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> mapDrive = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "register":
                    printRegister(mapDrive, command[1], command[2]);
                    break;
                case "unregister":
                    printUnregister(mapDrive, command[1]);
                    break;
            }
        }
        mapDrive.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }

    private static void printRegister(Map<String, String> mapDrive, String name, String plateNumber) {
        if (!mapDrive.containsKey(name)) {
            mapDrive.put(name, plateNumber);
            System.out.printf("%s registered %s successfully%n", name, mapDrive.get(name));
        }else {
            System.out.printf("ERROR: already registered with plate number %s%n", mapDrive.get(name));
        }
    }

    private static void printUnregister(Map<String, String> mapDrive, String name) {
        if (mapDrive.containsKey(name)) {
            System.out.printf("%s unregistered successfully%n", name);
            mapDrive.remove(name);
        }else {
            System.out.printf("ERROR: user %s not found%n", name);
        }
    }
}
