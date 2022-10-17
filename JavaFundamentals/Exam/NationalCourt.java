package JavaFundamentals2021.MidExam;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbPeople1 = Integer.parseInt(scanner.nextLine());
        int numbPeople2 = Integer.parseInt(scanner.nextLine());
        int numbPeople3 = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int hours = 0;

        int peopleForHour = numbPeople1 + numbPeople2 + numbPeople3;

        while (peopleCount > 0) {
            hours++;
            if (hours % 4 == 0) {
                continue;
            }
            peopleCount -= peopleForHour;
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
