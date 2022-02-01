import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public int borrowedCount() {
        return this.borrowedBooks.size();
    }
}
