package JavaFundamentals2021.RegularExpressionsExercises3007;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameRacers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        Map<String, Integer> nameAndDistanceRacer = new LinkedHashMap<>();
        String regexNameRacer = "[A-Za-z]+";
        String regexDistanceRacer = "\\d";
        Pattern patternName = Pattern.compile(regexNameRacer);
        Pattern patternDistance = Pattern.compile(regexDistanceRacer);

        while (!command.equals("end of race")) {
            Matcher matcherName = patternName.matcher(command);
            Matcher matcherDistance = patternDistance.matcher(command);
            StringBuilder nameRacer = new StringBuilder();
            int distance = 0;
            while (matcherName.find()) {
                nameRacer.append(matcherName.group());
            }
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());

            }
            for (String racer : nameRacers) {
                if (nameRacer.toString().contains(racer)) {
                    if (!nameAndDistanceRacer.containsKey(nameRacer.toString())) {
                        nameAndDistanceRacer.put(nameRacer.toString(), distance);
                    } else {
                        nameAndDistanceRacer.put(nameRacer.toString(), nameAndDistanceRacer.get(nameRacer.toString()) + distance);
                    }
                }
            }
            command = scanner.nextLine();
        }
        List<String> threeNameRacers = new ArrayList<>();
        nameAndDistanceRacer.entrySet().stream().sorted((value1, value2) -> Integer.compare(value2.getValue(),
                value1.getValue())).limit(3).forEach(entry -> threeNameRacers.add(entry.getKey()));

        System.out.printf("1st place: %s%n", threeNameRacers.get(0));
        System.out.printf("2nd place: %s%n", threeNameRacers.get(1));
        System.out.printf("3rd place: %s", threeNameRacers.get(2));

    }
}
