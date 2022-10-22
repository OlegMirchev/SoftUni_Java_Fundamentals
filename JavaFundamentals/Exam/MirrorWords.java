package JavaFundamentals2021.FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<separator>[\\@\\#])(?<word>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern patternInput = Pattern.compile(regex);
        Matcher matcherInput = patternInput.matcher(input);
        List<String> listWord = new ArrayList<>();
        int countMatcher = 0;

        while (matcherInput.find()) {
            countMatcher++;
            String oneWord = matcherInput.group("word");
            String secondWord = matcherInput.group("word2");
            StringBuilder reverse = new StringBuilder(secondWord);
            String reverseSecond = reverse.reverse().toString();

            if (reverseSecond.equals(oneWord)) {
                listWord.add(oneWord + " <=> " + secondWord);
            }
        }
        if (countMatcher > 0) {
            System.out.println(countMatcher + " word pairs found!");
        }else {
            System.out.println("No word pairs found!");
        }
        if (listWord.isEmpty()) {
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            //System.out.print(String.join(", ", listWord));
            for (int i = 0; i < listWord.size(); i++) {
                if (i == listWord.size() - 1) {
                    System.out.print(listWord.get(i));
                }else {
                    System.out.print(listWord.get(i) + ", ");
                }
            }
        }
    }
}
