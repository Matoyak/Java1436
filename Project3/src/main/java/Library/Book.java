package Library;

/**
 * Library of Project3
 * Created by Mason Matlock on 7/16/2015.
 */
public class Book {
    private String name;
    private String genre;

    public Book() {
        name = "Untitled";
        genre = "Anonymous";
    }

    public Book(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }
}
