package JavaFundamentals2021.RegularExpressionsLAB2807;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        String regexPhone = "\\+359(?<separator>[ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(phone);

        List<String> phoneNumber = new ArrayList<>();

        while (matcher.find()) {
            phoneNumber.add(matcher.group());
        }
        System.out.print(String.join(", ", phoneNumber));
    }
}
