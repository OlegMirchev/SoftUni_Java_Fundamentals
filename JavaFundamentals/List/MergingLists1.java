package JavaFundamentals2021.ListsLAB1606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        if (firstNumbers.size() >= secondNumbers.size()) {
            for (int i = 0; i < firstNumbers.size(); i++) {
                result.add(firstNumbers.get(i));
                if (i < secondNumbers.size()) {
                    result.add(secondNumbers.get(i));
                }
            }
        }else {
            for (int i = 0; i < secondNumbers.size(); i++) {
                if (i < firstNumbers.size()) {
                    result.add(firstNumbers.get(i));
                }
                result.add(secondNumbers.get(i));
            }
        }
        System.out.print(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
