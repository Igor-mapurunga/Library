public class Loan {

    private int loanId;
    private int bookId;
    private String loanDate;
    private String returnDate;
    private boolean isActive;
    private String realReturnDate;
    private double fine;

    public Loan() {

    }
    public Loan(int loanId, int bookId, String loanDate, String returnDate, boolean status, String realReturnDate, double fine) {
        this.loanId = loanId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.isActive = status;
        this.realReturnDate = realReturnDate;
        this.fine = fine;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public String getRealReturnDate() {
        return realReturnDate;
    }

    public void setRealReturnDate(String realReturnDate) {
        this.realReturnDate = realReturnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
