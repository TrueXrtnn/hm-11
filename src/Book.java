import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearOfPublication;
    private String nameAuthor;
    private  String nameToString;


    public Book(String nameBook, int yearOfPublication,Author author) {
        this.nameToString = author.toString();
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.nameAuthor =  author.getFullName();

    }

    public String getNameAuthor() {
        return this.nameAuthor;
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
        return "Название книги: "+this.nameBook+". Год публикации книги: "+ this.yearOfPublication+". "+nameToString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthor);
    }
}
