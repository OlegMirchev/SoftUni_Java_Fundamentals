package JavaFundamentals2021.MapsLambdaStreamAPILAB1407;

import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbs = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        numbs.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(result -> System.out.print(result + " "));

    }
}
