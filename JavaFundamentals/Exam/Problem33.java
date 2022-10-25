package JavaFundamentals2021.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> mapLike = new LinkedHashMap<>();
        Map<String, Integer> mapComments = new LinkedHashMap<>();
        Map<String, Integer> username = new TreeMap<>();

        while (!command.equals("Log out")) {
            String[] newCommand = command.split(": ");
            switch (newCommand[0]) {
                case "New follower":
                    getNew(mapLike, mapComments, newCommand[1]);
                    break;
                case "Like":
                    getLike(mapLike, mapComments, newCommand[1], newCommand[2]);
                    break;
                case "Comment":
                    getComment(mapLike, mapComments, newCommand[1]);
                    break;
                case "Blocked":
                    getBlocked(mapLike, mapComments, newCommand[1]);
                    break;
            }
            command = scanner.nextLine();
        }
        for (String result : mapLike.keySet()) {
            username.put(result, mapLike.get(result));
        }
        for (String result : mapComments.keySet()) {
            if (mapLike.containsKey(result)) {
                username.put(result, username.get(result) + mapComments.get(result));
            }else {
                username.put(result, mapComments.get(result));
            }
        }
        System.out.printf("%d followers%n", username.keySet().size());
        username.entrySet().stream().sorted((value1, value2) -> Integer.compare(value2.getValue(), value1.getValue()))
                .forEach(entry -> {
                    String name = entry.getKey();
                    System.out.printf("%s: %d%n", name, entry.getValue());
                });
    }

    private static void getNew(Map<String, Integer> mapLike, Map<String, Integer> mapComments, String name) {
        if (!mapComments.containsKey(name)) {
            mapComments.put(name, 0);
            mapLike.put(name, 0);
        }
    }

    private static void getLike(Map<String, Integer> mapLike, Map<String, Integer> mapComments, String name, String count) {
        if (!mapLike.containsKey(name)) {
            mapLike.put(name, Integer.parseInt(count));
        }else {
            mapLike.put(name, mapLike.get(name) + Integer.parseInt(count));
        }
    }

    private static void getComment(Map<String, Integer> mapLike, Map<String, Integer> mapComments, String newName) {
        if (!mapComments.containsKey(newName)) {
            mapComments.put(newName, 1);
        }else {
            mapComments.put(newName, mapComments.get(newName) + 1);
        }
    }

    private static void getBlocked(Map<String, Integer> mapLike, Map<String, Integer> mapComments, String newName) {
        if (mapLike.containsKey(newName) && mapComments.containsKey(newName)) {
            mapLike.remove(newName);
            mapComments.remove(newName);
        }else {
            System.out.printf("%s doesn't exist.%n", newName);
        }
    }
}
