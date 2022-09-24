package JavaFundamentals2021.ObjectExersice2506;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articles = scanner.nextLine().split(",\\s+");
        String title = articles[0];
        String content = articles[1];
        String author = articles[2];

        DataArticles dataArticles = new DataArticles(title, content, author);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String[] command = scanner.nextLine().split(": ");
            String commandName = command[0];
            String commandParameter = command[1];

            switch (commandName) {
                case "Edit":
                    dataArticles.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    dataArticles.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    dataArticles.rename(commandParameter);
                    break;
            }
        }
        System.out.println(dataArticles);
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
