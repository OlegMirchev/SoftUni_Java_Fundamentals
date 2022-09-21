package JavaFundamentals2021.ObjectLAB2306;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random randomize = new Random();

        for (int i = 0; i < words.length; i++) {
            int position = randomize.nextInt(words.length);
            String a = words[position];
            String b = words[i];
            words[position] = b;
            words[i] = a;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
