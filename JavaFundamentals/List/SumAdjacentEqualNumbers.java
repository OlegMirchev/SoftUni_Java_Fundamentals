package JavaFundamentals2021.ListsLAB1606;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = Arrays.stream(scanner.nextLine().split(" ")). map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < number.size() - 1; i++) {
            if (number.get(i).equals(number.get(i + 1))) {
                number.set(i, number.get(i) + number.get(i + 1));
                number.remove(i + 1);
                i = -1;
            }
        }
        for (Double result : number) {
            System.out.print(new DecimalFormat("0.# ").format(result));
        }
    }
}
