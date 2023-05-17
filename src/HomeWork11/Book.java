package HomeWork11;

public class Book {
    private String nameBook;

    private int publishYear;

    private Author author;

    public Book(String nameBook, int publishYear, Author author) {
        this.nameBook = nameBook;
        this.publishYear = publishYear;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
    public void setPublishYear() {
        this.publishYear;
    }
    public Author getAuthor() {
        return this.author;
    }
}
