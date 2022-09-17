package JavaFundamentals2021.ListsLAB1606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

       int lengthList = Math.min(firstNumbers.size(), secondNumbers.size());

        for (int i = 0; i < lengthList; i++) {
            System.out.print(firstNumbers.get(i) + " " + secondNumbers.get(i) + " ");
        }
        printList(firstNumbers, lengthList);
        printList(secondNumbers, lengthList);
    }

    private static void printList(List<Integer> lastNumber, int lengthList) {
        for (int i = lengthList; i < lastNumber.size(); i++) {
            System.out.print(lastNumber.get(i) + " ");
        }
    }
}
