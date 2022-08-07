package JavaFundamentals2021.BasicSyntaxLAB1905;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int HourToMin = hours * 60;
        int allMin = HourToMin + minutes + 30;
        int minToHour = allMin / 60;
        int minBack30 = allMin % 60;

        if (minToHour >= 24) {
            minToHour = 0;
        }
        System.out.printf("%d:%02d", minToHour, minBack30);

    }
}
