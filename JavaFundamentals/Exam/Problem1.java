package JavaFundamentals2021.MidExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        int count = 0;
        boolean isValid = false;

        for (int i = 1; i <= countBattles; i++) {
            double experiencePerBattle = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0) {
                experiencePerBattle *= 1.15;
            }
            if (i % 5 == 0) {
                experiencePerBattle *= 0.90;
            }
            if (i % 15 == 0) {
                experiencePerBattle *= 1.05;
            }
            sum += experiencePerBattle;

            count = i;
            if (sum >= neededExperience) {
                isValid = true;
                break;
            }
        }
        if (sum >= neededExperience || isValid) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", count);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", Math.abs(neededExperience - sum));
        }
    }
}
