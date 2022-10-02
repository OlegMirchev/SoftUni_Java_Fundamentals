package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> word = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<Character, Integer> mapWord = new LinkedHashMap<>();

        for (String listWord : word) {
            for (int i = 0; i < listWord.length(); i++) {
            char symbol = listWord.charAt(i);

            if (!mapWord.containsKey(symbol)) {
                mapWord.put(symbol, 1);
            } else {
                mapWord.put(symbol, mapWord.get(symbol) + 1);
            }
        }
    }
        mapWord.entrySet().forEach(resultEntry -> System.out.println(resultEntry.getKey() + " -> " + resultEntry.getValue()));
    }
}
