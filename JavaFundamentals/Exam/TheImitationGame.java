package JavaFundamentals2021.MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> encryptedMessage = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] operations = command.split("\\|");

            switch (operations[0]) {
                case "Move":
                    printMove(encryptedMessage,operations);
                    break;
                case "Insert":
                    printInsert(encryptedMessage, operations);
                    break;
                case "ChangeAll":
                    printChangeAll(encryptedMessage, operations);
                    break;
            }

            command = scanner.nextLine();
        }
        String result = "";
        for (String list : encryptedMessage) {
            result += list;
        }
        System.out.printf("The decrypted message is: %s", result);
    }

    private static void printMove(List<String> encryptedMessage, String[] operations) {
        for (int i = 0; i < Integer.parseInt(operations[1]); i++) {
            encryptedMessage.add(encryptedMessage.size(), encryptedMessage.get(0));
            encryptedMessage.remove(encryptedMessage.get(0));
        }
    }

    private static void printInsert(List<String> encryptedMessage, String[] operations) {
       String[] array = operations[2].split("");
        for (int i = array.length - 1; i >= 0; i--) {
            encryptedMessage.add(Integer.parseInt(operations[1]), array[i]);
        }
    }

    private static void printChangeAll(List<String> encryptedMessage, String[] operations) {
        String a = operations[1];
        String b = operations[2];

        Collections.replaceAll(encryptedMessage, a, b);
    }
}
