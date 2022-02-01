import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("Berserk", "Kentaro Miura", "Manga");
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.borrowedCount());
    }
}
