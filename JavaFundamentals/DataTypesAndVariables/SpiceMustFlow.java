package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int leaving = 0;
        int consumer = 0;
        int days = 0;

        while (startingYield >= 100) {
            days++;
            consumer = startingYield;
            consumer -= 26;
            leaving += consumer;
            startingYield -= 10;
        }
        if (days > 0) {
            leaving -= 26;
        }
        System.out.println(days);
        System.out.println(leaving);
    }
}
