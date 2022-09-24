package JavaFundamentals2021.ObjectExersice2506;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] phrases = new String[] {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();

        for (int i = 1; i <= number; i++) {
            int phrasesElements = random.nextInt(phrases.length);
            int eventsElements = random.nextInt(events.length);
            int authorElements = random.nextInt(authors.length);
            int citiesElements = random.nextInt(cities.length);

            System.out.printf("%s %s %s - %s%n", phrases[phrasesElements], events[eventsElements], authors[authorElements], cities[citiesElements]);
        }
    }
}
