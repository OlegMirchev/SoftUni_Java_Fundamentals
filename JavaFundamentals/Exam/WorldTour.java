package JavaFundamentals2021.FinalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] newCommand = command.split(":");
            switch (newCommand[0]) {
                case "Add Stop":
                    getAddStop(input, Integer.parseInt(newCommand[1]), newCommand[2]);
                    break;
                case "Remove Stop":
                    getRemoveStop(input, Integer.parseInt(newCommand[1]), Integer.parseInt(newCommand[2]));
                    break;
                case "Switch":
                    getSwitch(input, newCommand[1], newCommand[2]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", input);
    }

    private static void getAddStop(StringBuilder input, int index, String name) {
        if (index >= 0 && index < input.length()) {
            input.insert(index, name);
            System.out.println(input);
        }
    }

    private static void getRemoveStop(StringBuilder input, int startIndex, int endIndex) {
        if (startIndex >= 0 && endIndex < input.length()) {
            input.delete(startIndex, endIndex + 1);
            System.out.println(input);
        }
    }

    private static void getSwitch(StringBuilder input, String old, String now) {
       String output = input.toString();
       output = output.replaceAll(old, now);
       input.delete(0, input.length());
       input.append(output);
        System.out.println(input);
    }
}
