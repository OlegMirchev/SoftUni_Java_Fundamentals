package JavaFundamentals2021.BasicSyntaxLAB1905.BasicSyntaxExersice2105;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countTrashHeadset = lostGame / 2;
        int countTrashMouse = lostGame / 3;
        int countTrashKeyboard = lostGame / 6;
        int countTrashDisplay = lostGame / 12;

        double costs = headsetPrice * countTrashHeadset + mousePrice * countTrashMouse + keyboardPrice * countTrashKeyboard
                + displayPrice * countTrashDisplay;

        System.out.printf("Rage expenses: %.2f lv.", costs);
    }
}
