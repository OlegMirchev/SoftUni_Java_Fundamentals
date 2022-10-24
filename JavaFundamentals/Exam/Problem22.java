package JavaFundamentals2021.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regexReg = "(?<separator1>U\\$)(?<username>[A-Za-z]{3,})\\1(?<separator2>P@\\$)(?<password>[a-z]{5,}[0-9]+)\\3";
        Pattern patternReg = Pattern.compile(regexReg);
        int countReg = 0;

        for (int i = 1; i <= n; i++) {
            String registration = scanner.nextLine();
            Matcher matcherReg = patternReg.matcher(registration);

            if (matcherReg.find()) {
                countReg++;
                String username = matcherReg.group("username");
                String password = matcherReg.group("password");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", username, password);

            }else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d", countReg);
    }
}
