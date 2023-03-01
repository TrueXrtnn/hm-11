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
}