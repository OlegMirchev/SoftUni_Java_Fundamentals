package JavaFundamentals2021.RegularExpressionsExercises3007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String regexFurniture = ">>(?<furnitures>[A-Za-z]+)<<(?<price>\\d+.?\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regexFurniture);
        List<String> listFurniture = new ArrayList<>();
        double totalPrice = 0.0;

        while (!command.equals("Purchase")) {
            Matcher matcher = pattern.matcher(command);

            if (matcher.find()) {
                String nameFurniture = matcher.group("furnitures");
                double priceFurniture = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                listFurniture.add(nameFurniture);
                totalPrice += priceFurniture * quantity;

            }
            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String resultFurniture : listFurniture) {
            System.out.println(resultFurniture);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
