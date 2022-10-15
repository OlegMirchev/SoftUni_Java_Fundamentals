package JavaFundamentals2021.RegularExpressionsExercises3007;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0.0;

        while (!command.equals("end of shift")) {
            Matcher matcherProduct = pattern.matcher(command);
            double sumProducts = 0.0;
            if (matcherProduct.find()) {
                String name = matcherProduct.group("name");
                String product = matcherProduct.group("product");
                int quantity = Integer.parseInt(matcherProduct.group("quantity"));
                double price = Double.parseDouble(matcherProduct.group("price"));
                sumProducts += quantity * price;
                totalPrice += quantity * price;

                System.out.printf("%s: %s - %.2f%n", name, product, sumProducts);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
// %(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\w+)>[^|$%.]*\|(?<count>[0-9]+)\|[^|$%.]*?(?<price>[0-9]+\.*[0-9]*)\$
//
//%(?<name>[A-Za-z]+)%(?<separator>[^\|\$%\.]*)<(?<product>\w+)>\2\|(?<quantity>\d+)\|\2(?<price>\d+.?\d*)\$