package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequences = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int maxLength = 0;
        int maxPos = lengthSequences - 1;
        int maxSum = 0;
        int[] winArray = new int[lengthSequences];
        int count = 0;
        int counterWin = 0;

        while (!command.equals("Clone them!")) {
            int[] dna = Arrays.stream(command.split("!+"))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            count++;
            int sum = 0;
            int countStart = -1;
            int countLength = 0;
            int currentPositionMax = -1;
            int currentLengthMax = 0;
            boolean isValid = false;

            for (int i = 0; i < dna.length; i++) {
                if (dna[i] == 1) {
                    if (countStart == - 1) {
                        countStart = i;
                    }
                    sum++;
                    countLength++;
                }
                if (dna[i] == 0 || i == dna.length - 1) {
                    if (countLength > currentLengthMax) {
                        currentLengthMax = countLength;
                        currentPositionMax = countStart;
                    }
                    countLength = 0;
                    countStart = -1;
                }
            }
            if (currentLengthMax > maxLength) {
                isValid = true;
            }
            if (currentLengthMax == maxLength && currentPositionMax < maxPos) {
                isValid = true;
            }
            if (currentLengthMax == maxLength && currentPositionMax == maxPos && sum > maxSum) {
                isValid = true;
            }
            if (isValid) {
                maxLength = currentLengthMax;
                maxPos = currentPositionMax;
                winArray = dna;
                maxSum = sum;
                counterWin = count;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", counterWin, maxSum);
        for (int numbers : winArray) {
            System.out.print(numbers + " ");
        }
    }
}