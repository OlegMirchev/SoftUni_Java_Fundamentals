package JavaFundamentals2021.ObjectExersice2506;

public class DataArticles {
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
