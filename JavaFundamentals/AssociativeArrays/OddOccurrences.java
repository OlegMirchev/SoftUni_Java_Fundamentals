package JavaFundamentals2021.MapsLambdaStreamAPILAB1407;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<String, Integer> mapString = new LinkedHashMap<>();
        List<String> oddNumber = new ArrayList<>();

        for (String list : input) {
            String word = list.toLowerCase();
            if (!mapString.containsKey(word)) {
                mapString.put(word, 1);
            }else {
                mapString.put(word, mapString.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mapString.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddNumber.add(entry.getKey());
            }
        }
        for (int i = 0; i < oddNumber.size(); i++) {
            if (i == oddNumber.size() - 1) {
                System.out.print(oddNumber.get(i));
            }else {
                System.out.print(oddNumber.get(i) + ", ");
            }
        }
    }
}
