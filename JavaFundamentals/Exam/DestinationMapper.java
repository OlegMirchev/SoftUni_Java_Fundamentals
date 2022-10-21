package JavaFundamentals2021.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regexPlaces = "(?<separator>[=\\/])(?<places>[A-Z][A-Za-z]{2,})\\1";
        Pattern patternPlaces = Pattern.compile(regexPlaces);
        Matcher matcherPlaces = patternPlaces.matcher(input);
        List<String> places = new ArrayList<>();
        int travelPoints = 0;

        while (matcherPlaces.find()) {
            places.add(matcherPlaces.group("places"));
            travelPoints += matcherPlaces.group("places").length();
        }
        String result = String.join(", ", places);
        System.out.printf("Destinations: %s%n", result);
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
