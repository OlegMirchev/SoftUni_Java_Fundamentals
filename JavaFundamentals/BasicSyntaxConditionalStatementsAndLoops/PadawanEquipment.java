package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts  = Double.parseDouble(scanner.nextLine());
        double freeBelts = 0.0;

        for (int i = 1; i <= countOfStudents; i++) {
            if (i % 6 == 0) {
                freeBelts += priceOfBelts;
            }
        }
        double costs = (Math.ceil(countOfStudents * 1.10) * priceOfLightSabers +
                (priceOfRobes * countOfStudents) + (priceOfBelts * countOfStudents - freeBelts));

        if (amountOfMoney >= costs) {
            System.out.printf("The money is enough - it would cost %.2flv.", costs);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", costs - amountOfMoney);
        }
    }
}
