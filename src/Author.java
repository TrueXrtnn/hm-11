import java.util.Objects;

public class Author {
    private String fullName;

    public Author(String fullName) {
        String[] words = fullName.split(" ");
        String nameAuthor = words[0];
        for (int i = 1; i < words.length; i++) {
            nameAuthor = nameAuthor + " " + words[i].charAt(0) + ".";
        }
        this.fullName = nameAuthor;
    }

    public String getFullName() {
        return this.fullName;
    }
    public String toString (){
        return "Автор книги: "+this.fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(fullName, author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}