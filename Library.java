import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);

    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public Library(List<Book> books, List<Member> members, List<Loan> loans) {
        this.books = books;
        this.members = members;
        this.loans = loans;
    }
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public void addBook(Book book) {
        for(Book b : books){
            if (b.getId() == book.getId()){
                System.out.println("This book already exists in your library");
                return;
            }
        }
        books.add(book);
        System.out.println("The book: " + book.getName() + " was added successfully");
    }

    public void removeBook(int theId) {
        Scanner sc = new Scanner(System.in);
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId() == theId){
                System.out.println("Do you really want to remove the following book? " + b.getName() );
                String answer = sc.nextLine();
                if (answer.equals("y")){
                    books.remove(b);
                    System.out.println("Book removed successfully");
                }else {
                    System.out.println("the process of removing the book was canceled.");
                }
                break;
            }
        }
    }

    public void updateBook(int bookId){
        Scanner sc = new Scanner(System.in);
        boolean bookFound = false;
        for (Book b : books){
            if (b.getId() == bookId){
                bookFound = true;
                System.out.println("Type 1 to update the name.");
                System.out.println("Type 2 to update the author.");
                System.out.println("Type 3 to update the year of publish.");
                System.out.println("Type 4 to update the code.");
                System.out.println("Type 5 to update the publisher.");

                int update = sc.nextInt();
                sc.nextLine();

                switch (update){

                    case 1:
                        System.out.println("Enter new name");
                        b.setName(sc.nextLine());
                        System.out.println("Name update successfully");
                        break;

                    case 2:
                        System.out.println("Enter new author name");
                        b.setAuthor(sc.nextLine());
                        System.out.println("Author update successfully");
                        break;

                    case 3:
                        System.out.println("Enter new year of publish");
                        b.setYearOfPublish(sc.nextInt());
                        System.out.println("Year of publish update successfully");
                        break;
                    case 4:
                        System.out.println("Enter new ID");
                        b.setId(sc.nextInt());
                        System.out.println("ID update successfully");
                        break;
                    case 5:
                        System.out.println("Enter new name for publisher");
                        b.setPublisher(sc.nextLine());
                        System.out.println("Publisher update successfully");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
        if (!bookFound) {
            System.out.println("Book not found");
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", members=" + members +
                ", loans=" + loans +
                '}';
    }
}
