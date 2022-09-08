package JavaFundamentals2021.MethodsLAB0906;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        printGrade(grade);
    }

    private static void printGrade(double inputGrade) {
        if (inputGrade >= 2.00 && inputGrade < 3.00) {
            System.out.println("Fail");
        }else if (inputGrade >= 3.00 && inputGrade < 3.50) {
            System.out.println("Poor");
        }else if (inputGrade >= 3.50 && inputGrade < 4.50) {
            System.out.println("Good");
        }else if (inputGrade >= 4.50 && inputGrade < 5.50) {
            System.out.println("Very good");
        }else if (inputGrade >= 5.50 && inputGrade <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
