package JavaFundamentals2021.ObjectExersice2506;

import java.util.*;
import java.util.stream.Collectors;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<DataArticles> word = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(", ");
            String title = command[0];
            String content = command[1];
            String author = command[2];

            DataArticles dataArticles = new DataArticles(title, content, author);
            word.add(dataArticles);
        }
        String input = scanner.nextLine();
        if (input.equals("title")) {
            word = word.stream().sorted(Comparator.comparing(DataArticles::getTitle)).collect(Collectors.toList());
        } else if (input.equals("content")) {
            word = word.stream().sorted(Comparator.comparing(DataArticles::getContent)).collect(Collectors.toList());
        } else if (input.equals("author")) {
            word = word.stream().sorted(Comparator.comparing(DataArticles::getAuthor)).collect(Collectors.toList());
        }


        for (DataArticles resultArticles : word) {
            System.out.println(resultArticles);
        }
    }

    public static class DataArticles {
        private String title;
        private String content;
        private String author;


        public DataArticles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }

    }
}
