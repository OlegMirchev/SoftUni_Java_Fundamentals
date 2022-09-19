package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {

            if (firstPlayerDeck.get(0) > secondPlayerDeck.get(0)) {
                firstPlayerDeck.add(firstPlayerDeck.get(0));
                firstPlayerDeck.add(secondPlayerDeck.get(0));
                firstPlayerDeck.remove(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));

            }else if (firstPlayerDeck.get(0) < secondPlayerDeck.get(0)) {
                secondPlayerDeck.add(secondPlayerDeck.get(0));
                secondPlayerDeck.add(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));
                firstPlayerDeck.remove(firstPlayerDeck.get(0));

            }else {
                firstPlayerDeck.remove(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));

            }
            if (firstPlayerDeck.isEmpty()) {
                int sum = 0;
                for (Integer digit : secondPlayerDeck) {
                    sum += digit;
                }
                System.out.printf("Second player wins! Sum: %d", sum);
                break;

            }else if (secondPlayerDeck.isEmpty()) {
                int sum = 0;
                for (Integer digit : firstPlayerDeck) {
                    sum += digit;
                }
                System.out.printf("First player wins! Sum: %d", sum);
                break;
            }
        }
    }
}
