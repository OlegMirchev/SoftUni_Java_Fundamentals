package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int count = 0;
        double finalPrice = 0.0;

        Map<String, Double> mapProduct = new LinkedHashMap<>();
        Map<String, Integer> oldProduct = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String[] input = command.split("\\s+");
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);


            if (!mapProduct.containsKey(product)) {
                mapProduct.put(product, quantity * price);
                oldProduct.put(product, quantity);
            }else {
                oldProduct.put(product, oldProduct.get(product) + quantity);
                mapProduct.put(product, oldProduct.get(product) * price);
            }

            command = scanner.nextLine();
        }
        mapProduct.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
