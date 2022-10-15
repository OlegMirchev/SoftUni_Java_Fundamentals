package JavaFundamentals2021.RegularExpressionsExercises3007;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regexStarCode = "@(?<planet>[A-Za-z]+)[^@!:and-]*:(?<population>\\d+)[^@!:and-]*!(?<attackType>[AD])![^@!:and-]*->[^@!:and-]*(?<soldiers>\\d+)";
        Pattern patternStarCode = Pattern.compile(regexStarCode);
        Map<String, Integer> nameAttack = new LinkedHashMap<>();
        Map<String, Integer> nameDestroy = new LinkedHashMap<>();
        int countA = 0;
        int countD = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            StringBuilder code = new StringBuilder();
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r' || symbol == 'S' || symbol == 'T'
                || symbol == 'A' || symbol == 'R') {
                    count++;
                }
            }
            for (int k = 0; k < input.length(); k++) {
                char letter = (char) (input.charAt(k) - count);
                code.append(letter);
            }
            Matcher matcherStarCode = patternStarCode.matcher(code.toString());
            if (matcherStarCode.find()) {
                String namePlanet = matcherStarCode.group("planet");
                int planetPopulation = Integer.parseInt(matcherStarCode.group("population"));
                String attackType = matcherStarCode.group("attackType");
                int numbSoldiers = Integer.parseInt(matcherStarCode.group("soldiers"));
                if (attackType.equals("A")) {
                    nameAttack.put(namePlanet, planetPopulation);
                    countA++;
                }else if (attackType.equals("D")) {
                    nameDestroy.put(namePlanet, planetPopulation);
                    countD++;
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", countA);
        nameAttack.entrySet().stream().sorted((key1, key2) -> key1.getKey().compareToIgnoreCase(key2.getKey()))
                .forEach(entryA -> System.out.printf("-> %s%n",entryA.getKey()));

        System.out.printf("Destroyed planets: %d%n", countD);
        nameDestroy.entrySet().stream().sorted((key1, key2) -> key1.getKey().compareToIgnoreCase(key2.getKey()))
                .forEach(entryD -> System.out.printf("-> %s%n", entryD.getKey()));



        //System.out.printf("Attacked planets: %d%n", countA);
        //System.out.printf("-> %s%n", nameAttack);

        //System.out.printf("Destroyed planets: %d%n", countD);
        //System.out.printf("-> %s%n", nameDestroy);
    }
}
