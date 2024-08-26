import java.util.ArrayList;
import java.util.List;

public class Library {

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


}
