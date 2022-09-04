package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0;

        for (int i = 1; i <= n; i++) {
            String[] text = scanner.nextLine().split(" ");
            int[] peopleTrain = Arrays.stream(text)
              .mapToInt(Integer::parseInt).toArray();
            sumPeople += peopleTrain[0];
            System.out.print(peopleTrain[0] + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
