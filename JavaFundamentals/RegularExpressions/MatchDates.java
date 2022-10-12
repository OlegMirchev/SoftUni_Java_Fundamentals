package JavaFundamentals2021.RegularExpressionsLAB2807;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})(?<separator>[.\\/-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Day: " + matcher.group("day") + ", " + "Month: " + matcher.group("month")
                    + ", " + "Year: " + matcher.group("year"));
        }
    }
}
