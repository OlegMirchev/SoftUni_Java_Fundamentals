package JavaFundamentals2021.MapsLambdaStreamAPILAB1407;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonym = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String wordKey = scanner.nextLine();
            String synonymValue = scanner.nextLine();

            if (!wordSynonym.containsKey(wordKey)) {
                List<String> currentSynonym = new ArrayList<>();
                currentSynonym.add(synonymValue);
                wordSynonym.put(wordKey, currentSynonym);
            }else {
                List<String> currentSynonym = wordSynonym.get(wordKey);
                currentSynonym.add(synonymValue);
                wordSynonym.put(wordKey, currentSynonym);
            }
        }
        for (Map.Entry<String, List<String>> resultEntry : wordSynonym.entrySet()) {
            System.out.printf("%s - %s%n", resultEntry.getKey(), String.join(", ", resultEntry.getValue()));
        }
    }
}
