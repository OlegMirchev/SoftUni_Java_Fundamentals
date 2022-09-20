package JavaFundamentals2021.ListsExersice1806;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];
            switch (command[2]) {
                case "going!":
                    if (guests.contains(name)) {
                        System.out.printf("%s is already in the list!%n", name);
                    }else {
                        guests.add(name);
                    }
                    break;
                case "not":
                    if (guests.contains(name)) {
                        guests.remove(name);
                    }else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
                    break;
            }
        }
        for (String list : guests) {
            System.out.println(list);

        }
    }
}
