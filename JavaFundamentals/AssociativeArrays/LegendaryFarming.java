package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapFarming = new TreeMap<>();
        Map<String, Integer> mapJunkFarming = new LinkedHashMap<>();
        mapFarming.put("motes", 0);
        mapFarming.put("fragments", 0);
        mapFarming.put("shards", 0);

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            for (int i = 0; i < command.length; i += 2) {
                int quantity = Integer.parseInt(command[i]);
                String materials = command[i + 1].toLowerCase();
                if (materials.equals("motes") || materials.equals("fragments") || materials.equals("shards")) {
                    if (!mapFarming.containsKey(materials)) {
                        mapFarming.put(materials, quantity);
                    }else {
                        mapFarming.put(materials, mapFarming.get(materials) + quantity);
                    }
                    if (mapFarming.get(materials) >= 250) {
                        if (materials.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        }else if (materials.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }else if (materials.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        }
                        mapFarming.put(materials, mapFarming.get(materials) - 250);
                        mapFarming.entrySet().stream()
                                .sorted((value1, value2) -> value2.getValue().compareTo(value1.getValue()))
                                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

                        // mapJunkFarming.forEach((key, value) -> System.out.println(key + ": " + value));
                        //mapJunkFarming.entrySet().stream().sorted().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
                        mapJunkFarming.entrySet().stream().sorted((key1, key2) -> key1.getKey().compareToIgnoreCase(key2.getKey()))
                                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
                        return;
                    }
                }else {
                    if (!mapJunkFarming.containsKey(materials)) {
                        mapJunkFarming.put(materials, quantity);
                    }else {
                        mapJunkFarming.put(materials, mapJunkFarming.get(materials) + quantity);
                    }
                }
            }
        }
    }
}
