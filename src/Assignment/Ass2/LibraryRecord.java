package Assignment.Ass2;

public class LibraryRecord {

    private String bookTitle;
    private String borrowerName; // null if never borrowed
    private int borrowDays;
    private boolean borrowed;

    // Constructor for books never borrowed
    public LibraryRecord(String bookTitle) {
        this.bookTitle = bookTitle;
        this.borrowerName = null;
        this.borrowDays = 0;
        this.borrowed = false;
    }

    // Constructor for borrowed books
    public LibraryRecord(String bookTitle, String borrowerName, int borrowDays) {
        this.bookTitle = bookTitle;
        this.borrowerName = borrowerName;
        this.borrowDays = borrowDays;
        this.borrowed = true;
    }

    @Override
    public String toString() {
        String status = borrowed ? "Borrowed" : "Available";
        String borrower = (borrowerName != null) ? borrowerName : "None";

        return "Book Title: " + bookTitle +
                "\nBorrower Name: " + borrower +
                "\nBorrow Duration: " + borrowDays + " days" +
                "\nStatus: " + status;
    }
}
