package JavaFundamentals2021.ListsLAB1606;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < number.size(); i++) {
            if (i == number.size() - 1) {
                break;
            }
            number.set(i, number.get(i) + number.get(number.size() - 1));
            number.remove(number.size() - 1);

        }
        for (Integer integer : number) {
            System.out.print(integer + " ");
        }
    }
}
