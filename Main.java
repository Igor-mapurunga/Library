public class Main {
    public static void main(String[] args) {
    Library myLibrary = new Library();
    Book b1 = new Book("Lord of the rings","Tolkien","Fantasy",1954,1,"Mauricio de Souza");
    Book b2 = new Book("Star wars","Lucas Films","Sci-fi",1964,2,"Disney");
    myLibrary.addBook(b1);
    myLibrary.addBook(b2);
        myLibrary.removeBook(1);
        System.out.println(myLibrary);
    }
}
