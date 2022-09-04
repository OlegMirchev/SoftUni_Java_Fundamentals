package JavaFundamentals2021.ArraysExersice0405;

import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numb = new int[n];
        int sumPeople = 0;

        for (int i = 0; i < n; i++) {
            numb[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(numb[i] + " ");

        }
        for (int i = 0; i < numb.length; i++) {
            sumPeople += numb[i];
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
