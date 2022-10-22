package JavaFundamentals2021.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regexEmojis = "(?<separator>[:]{2,}|[*]{2,})(?<emojis>[A-Z][a-z]{2,})\\1";
        String regexNumber = "[0-9]";
        Pattern patternEmojis = Pattern.compile(regexEmojis);
        Pattern patternNumber = Pattern.compile(regexNumber);
        int coolThreshold = 1;
        int count = 0;

        Matcher matcherNumber = patternNumber.matcher(input);
        Matcher matcherEmojis = patternEmojis.matcher(input);
        List<String> listEmojis = new ArrayList<>();

        while (matcherNumber.find()) {
            coolThreshold *= Integer.parseInt(matcherNumber.group());
        }
        while (matcherEmojis.find()) {
            int sumEmojis = 0;
            count++;
            for (int i = 2; i < matcherEmojis.group().length() - 2; i++) {
                char symbol = matcherEmojis.group().charAt(i);
                sumEmojis += symbol;
            }
            if (coolThreshold < sumEmojis) {
                listEmojis.add(matcherEmojis.group());
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        listEmojis.forEach(emojis -> System.out.println(emojis));

        // (?<separator>[:]{2,}|[*]{2,})(?<emojis>[A-Z][a-z]{2,})\1 - true
        // (?<separator>[::**]{2,})(?<emojis>[A-Z][a-z]{2,})\1 - my
    }
}
