package JavaFundamentals2021.ListsLAB1606;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList = printResultList(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }else {
            Collections.reverse(resultList);
            System.out.print(resultList.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static List<Integer> printResultList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        return numbers;
    }
}
