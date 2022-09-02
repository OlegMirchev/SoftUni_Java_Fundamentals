package JavaFundamentals2021.ArraysExersice0405;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory1 {
    static int sumOfArrayElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthDna = Integer.parseInt(scanner.nextLine());
        int[] uniqueDna = new int[lengthDna];
        String command = scanner.nextLine();
        int longestSubsequence = 0;
        int bestDnaIndex = 0;
        int bestDnaNumber = 0;
        int sumOfElementsBestDna = 0;

        for (int o = 0; !command.equals("Clone them!"); o++) {

            int [] currentDna = Arrays.stream(command.split("!+"))
              .mapToInt(e -> Integer.parseInt(e)).toArray();
            int currentSequenceOnes = 0;
            for (int i = 0; i < currentDna.length; i++) {
                if (currentDna[i] == 1) {
                    currentSequenceOnes++;
                    if (currentSequenceOnes > longestSubsequence) {
                        longestSubsequence = currentSequenceOnes;
                        bestDnaIndex = i - longestSubsequence + 1;
                        bestDnaNumber = o + 1;
                        sumOfElementsBestDna = sumOfArrayElements(currentDna);
                        uniqueDna = currentDna;
                    }else if (currentSequenceOnes == longestSubsequence) {
                        int currentSequenceStartingIndex = i - currentSequenceOnes + 1;
                        if (currentSequenceStartingIndex < bestDnaIndex) {
                            bestDnaIndex = currentSequenceStartingIndex;
                            bestDnaNumber = o + 1;
                            sumOfElementsBestDna = sumOfArrayElements(currentDna);
                            uniqueDna = currentDna;
                        }else if (currentSequenceStartingIndex == bestDnaIndex) {
                            if (sumOfElementsBestDna < sumOfArrayElements(currentDna)) {
                                bestDnaNumber = o + 1;
                                sumOfElementsBestDna = sumOfArrayElements(currentDna);
                                uniqueDna = currentDna;
                            }
                        }
                    }
                }else {
                    currentSequenceOnes = 0;
                }
            }
            command = scanner.nextLine();
        }
        if (bestDnaNumber == 0) {
            bestDnaNumber = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestDnaNumber, sumOfElementsBestDna);
        for (int result : uniqueDna) {
            System.out.print(result + " ");
        }
    }
}
