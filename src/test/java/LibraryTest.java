import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library edinburghLibrary;
    private Book book1;
    private Book book2;
    private Book book3;
    private Borrower borrower1;

    @Before
    public void before() {
        edinburghLibrary = new Library();
        book1 = new Book("It", "Stephen King", "Horror");
        book2 = new Book("Emma", "Jane Austen", "Old an' that");
        book3 = new Book("IQ84", "Haruki Murakami", "Sci-Fi");
        borrower1 = new Borrower();
    }

    @Test
    public void can_add_book_to_collection(){
        edinburghLibrary.addBookToCollection(book1);
        edinburghLibrary.addBookToCollection(book2);
        assertEquals(2, edinburghLibrary.getBookCount());
    }

    @Test
    public void can_add_book_if_space(){
        edinburghLibrary.addBookToCollection(book1);
        assertEquals(1, edinburghLibrary.getBookCount());
    }

    @Test
    public void cannot_add_book_if_no_space(){
        edinburghLibrary.addBookToCollection(book1);
        edinburghLibrary.addBookToCollection(book2);
        edinburghLibrary.addBookToCollection(book3);
        assertEquals(2, edinburghLibrary.getBookCount());
    }

    @Test
    public void can_remove_book_from_collection(){
        edinburghLibrary.addBookToCollection(book1);
        edinburghLibrary.lendBook(book1, borrower1);
        assertEquals(0, edinburghLibrary.getBookCount());
    }

}
