package JavaFundamentals2021.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phone = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] newCommand = command.split(" - ");
            switch (newCommand[0]) {
                case "Add":
                    printAdd(phone, newCommand);
                    break;
                case "Remove":
                    printRemove(phone, newCommand);
                    break;
                case "Bonus phone":
                    printBonusPhone(phone, newCommand);
                    break;
                case "Last":
                    printLast(phone, newCommand);
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < phone.size(); i++) {
            if (i == phone.size() - 1) {
                System.out.print(phone.get(i));
            }else {
                System.out.print(phone.get(i) + ", ");
            }
        }
    }

    private static void printAdd(List<String> phone, String[] newCommand) {
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).equals(newCommand[1])) {
                return;
            }
        }
        phone.add(phone.size(), newCommand[1]);
    }

    private static void printRemove(List<String> phone, String[] newCommand) {
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).equals(newCommand[1])) {
                phone.remove(phone.get(i));
            }
        }
    }

    private static void printBonusPhone(List<String> phone, String[] newCommand) {
        String[] oldNew = newCommand[1].split(":");
        for (int i = phone.size(); i >= 0; i--) {
            if (phone.get(phone.size() - 1).equals(oldNew[0])) {
                phone.add(i, oldNew[1]);
                return;
            }
        }
    }

    private static void printLast(List<String> phone, String[] newCommand) {
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).equals(newCommand[1])) {
                phone.add(phone.size(), phone.get(i));
                phone.remove(phone.get(i));
                return;
            }
        }
    }
}
