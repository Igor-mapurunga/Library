public class Main {
    public static void main(String[] args) {
    Library myLibrary = new Library();
    Book b1 = new Book("Lord of the rings","Tolkien","Fantasy",1954,1,"Mauricio de Souza");
    myLibrary.addBook(b1);
        myLibrary.updateBook(1);
    }
}
