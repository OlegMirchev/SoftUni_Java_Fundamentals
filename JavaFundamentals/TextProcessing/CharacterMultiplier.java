package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        char[] firstLetter = input[0].toCharArray();
        char[] secondLetter = input[1].toCharArray();
        int totalSum = 0;
        int maxLetter = Math.max(firstLetter.length, secondLetter.length);
        int minLetter = Math.min(firstLetter.length, secondLetter.length);

        for (int i = 0; i < minLetter; i++) {
            totalSum += firstLetter[i] * secondLetter[i];

        }
        if (firstLetter.length < secondLetter.length) {
            for (int i = minLetter; i < maxLetter; i++) {
                totalSum += secondLetter[i];
            }
        }else if (secondLetter.length < firstLetter.length) {
            for (int i = minLetter; i <maxLetter ; i++) {
                totalSum += firstLetter[i];
            }
        }
        System.out.println(totalSum);
    }
}
