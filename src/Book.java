public class Book {
    private String nameBook;
    private int yearOfPublication;
    private String nameAuthor;


    public Book(String nameBook, int yearOfPublication, String nameAuthor) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.nameAuthor = nameAuthor;

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


}
