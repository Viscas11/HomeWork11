package HomeWork11;

public class Book {
    private String nameBook;
    private int publishYear;
    private final Author;
    public Book(String nameBook, int publishYear) {
        this.nameBook = nameBook;
        this.publishYear = publishYear;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
}
