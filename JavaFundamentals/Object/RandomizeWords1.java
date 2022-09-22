package JavaFundamentals2021.ObjectLAB2306;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Random randomize = new Random();

        while (words.size() > 0) {
            String finalWords = words.remove(randomize.nextInt(words.size()));
            System.out.println(finalWords);

        }
    }
}
