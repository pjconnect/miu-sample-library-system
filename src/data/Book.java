package data;

public class Book {
    public final String title;
    public final String ISBN;
    public final Author author;
    public final int copyOfBooks;

    public Book(String title, String ISBN, Author author, int copyOfBooks) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.copyOfBooks = copyOfBooks;
    }
}
