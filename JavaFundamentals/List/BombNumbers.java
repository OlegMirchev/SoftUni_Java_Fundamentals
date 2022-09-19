package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        int specialBomb = Integer.parseInt(command[0]);
        int power = Integer.parseInt(command[1]);
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(specialBomb)) {
                int index = numbers.indexOf(specialBomb);
               int left = Math.max(0, index - power);
               int right = Math.min(numbers.size() - 1, index + power);

                for (int j = left; j <= right; j++) {
                    numbers.remove(left);
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}



