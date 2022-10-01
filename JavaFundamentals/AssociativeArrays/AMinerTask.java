package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, Integer> resourceAndQuantity = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceAndQuantity.containsKey(resource)) {
                resourceAndQuantity.put(resource, quantity);
            }else {
                resourceAndQuantity.put(resource, resourceAndQuantity.get(resource) + quantity);
            }
            command = scanner.nextLine();
        }
        resourceAndQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
