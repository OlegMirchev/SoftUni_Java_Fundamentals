package JavaFundamentals2021.MapsLambdaStreamAPILAB1407;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] number = Arrays.stream(scanner.nextLine().split("\\s+"))
          .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> mapCount = new TreeMap<>();


        for (double numbs : number) {
            if (!mapCount.containsKey(numbs)) {
                mapCount.put(numbs, 1);
            }else {
                int metNumb = mapCount.get(numbs);
                metNumb++;
                mapCount.put(numbs, metNumb);
            }
        }
        for (Map.Entry<Double, Integer> entry : mapCount.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
