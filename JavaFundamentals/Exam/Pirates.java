package JavaFundamentals2021.FinalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> mapCitiesPeople = new TreeMap<>();
        Map<String, Integer> mapCitiesGold = new TreeMap<>();

        while (!command.equals("Sail")) {
            String[] citiesData = command.split("\\|+");
            String city = citiesData[0];
            int people = Integer.parseInt(citiesData[1]);
            int gold = Integer.parseInt(citiesData[2]);
            if (!mapCitiesPeople.containsKey(city)) {
                mapCitiesPeople.put(city, people);
                mapCitiesGold.put(city, gold);
            }else {
                mapCitiesPeople.put(city, mapCitiesPeople.get(city) + people);
                mapCitiesGold.put(city, mapCitiesGold.get(city) + gold);
            }
            command = scanner.nextLine();
        }
        String newCommand = scanner.nextLine();

        while (!newCommand.equals("End")) {
            String[] input = newCommand.split("=>");
            switch (input[0]) {
                case "Plunder":
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", input[1], Integer.parseInt(input[3]), Integer.parseInt(input[2]));
                    getPlunder(mapCitiesPeople, mapCitiesGold, input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]));
                    break;
                case "Prosper":
                    getProsper(mapCitiesGold, input[1], Integer.parseInt(input[2]));
                    break;
            }
            newCommand = scanner.nextLine();
        }
        if (mapCitiesGold.isEmpty() && mapCitiesPeople.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", mapCitiesGold.keySet().size());
            mapCitiesGold.entrySet().stream().sorted((value1, value2) -> Integer.compare(value2.getValue(), value1.getValue()))
                    .forEach(entry -> {
                        String people = entry.getKey();
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), mapCitiesPeople.get(people), entry.getValue());
                    });
        }
    }

    private static void getPlunder(Map<String, Integer> mapCitiesPeople, Map<String, Integer> mapCitiesGold, String city, int people, int gold) {
        if (mapCitiesPeople.containsKey(city)) {
            mapCitiesPeople.put(city, mapCitiesPeople.get(city) - people);
            mapCitiesGold.put(city, mapCitiesGold.get(city) - gold);
        }
        if (mapCitiesPeople.get(city) == 0 || mapCitiesGold.get(city) == 0) {
            mapCitiesPeople.remove(city);
            mapCitiesGold.remove(city);
            System.out.printf("%s has been wiped off the map!%n", city);
        }
    }

    private static void getProsper(Map<String, Integer> mapCitiesGold, String city, int gold) {
        if (gold <= 0) {
            System.out.println("Gold added cannot be a negative number!");
        }else {
            if (mapCitiesGold.containsKey(city)) {
                mapCitiesGold.put(city, mapCitiesGold.get(city) + gold);
                System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, mapCitiesGold.get(city));
            }
        }
    }
}
