import java.lang.reflect.Array;
import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;
    private Integer borrowingLimit;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
        this.borrowingLimit = 2;
    }

    public int getBorrowerBookCount(){
        return this.borrowedBooks.size();
    }

    public void borrowBook(Book book){
        if (this.getBorrowerBookCount() < this.borrowingLimit)
        this.borrowedBooks.add(book);
    }

    public int getBorrowingLimit(){
        return this.borrowingLimit;
    }

    public Book returnBook(){
        return this.borrowedBooks.remove(0);
    }

}
