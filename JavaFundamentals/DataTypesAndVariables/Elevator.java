package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbPeople = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());

        int result = (int) Math.ceil(numbPeople * 1.00 / capacityElevator);

        System.out.println(result);
    }
}
