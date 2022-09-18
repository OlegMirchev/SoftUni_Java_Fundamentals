package JavaFundamentals2021.ListsExersice1806;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> number = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(number);
        String[] listResult = number.toString().replaceAll("[\\[\\],]", "").trim().split("\\s+");


        for (String finalResult : listResult) {
            System.out.print(finalResult + " ");

        }
    }
}
