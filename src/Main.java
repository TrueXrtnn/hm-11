public class Main {
    public static void main(String[] args) {
        Author King = new Author("Стивен Кинг");
        Book theGreenMile = new Book("Зеленая миля", 2014, King);
        System.out.println("theGreenMile.getNameBook() = " + theGreenMile.getNameBook());
        System.out.println("theGreenMile.getYearOfPublication() = " + theGreenMile.getYearOfPublication());
        Author Bulgakov = new Author("Булгаков Михаил Афонасьевич");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", 1967, Bulgakov);
        System.out.println("theGreenMile.getNameBook() = " + theMasterAndMargarita.getNameBook());
        System.out.println("theGreenMile.getYearOfPublication() = " + theMasterAndMargarita.getYearOfPublication());
}}