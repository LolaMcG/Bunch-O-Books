import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Library edinburghLibrary;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        edinburghLibrary = new Library();
        borrower1 = new Borrower();
        book1 = new Book("It", "Stephen King", "Horror");
        book2 = new Book("Emma", "Jane Austen", "Old an that");
        book3 = new Book("IQ84", "Haruki Murakami", "Sci-Fi");
    }

    @Test
    public void can_borrow_book(){
//        System.out.println(borrower1.getBorrowerBookCount());
//        edinburghLibrary.addBookToCollection(book1);
//        System.out.println(borrower1.getBorrowerBookCount());
//        edinburghLibrary.lendBook(book1, borrower1);
//        System.out.println(borrower1.getBorrowerBookCount());
        borrower1.borrowBook(book1);
        System.out.println(borrower1.getBorrowerBookCount());
        assertEquals(1, borrower1.getBorrowerBookCount());
    }

    @Test
    public void cannot_borrow_any_more_books(){
        borrower1.borrowBook(book1);
        borrower1.borrowBook(book2);
        borrower1.borrowBook(book3);
        System.out.println(borrower1.getBorrowerBookCount());
        assertEquals(2, borrower1.getBorrowerBookCount());
    }

    @Test
    public void can_return_book(){
        edinburghLibrary.addBookToCollection(book1);
        edinburghLibrary.lendBook(book1, borrower1);
        borrower1.borrowBook(book1);
        borrower1.returnBook();
    }
}
