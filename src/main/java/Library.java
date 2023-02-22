import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;
    private ArrayList<Borrower> customers;

    public Library(){
        this.collection = new ArrayList<>();
        this.capacity = 2;
        this.customers = new ArrayList<>();
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        if (getBookCount() < this.capacity ) {
            this.collection.add(book);
        }
    }

    public Book lendBook(Book book, Borrower borrower){
        if (borrower.getBorrowerBookCount() < borrower.getBorrowingLimit()){
            return this.collection.remove(0);
            } else {
            return null;
        }
    }
}
