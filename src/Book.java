import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Author author;


    public Book(String nameBook, int yearOfPublication, Author author) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;

    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String toString() {
        return "Название книги: " + this.nameBook + ". Год публикации книги: " + this.yearOfPublication + ". " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }
}
