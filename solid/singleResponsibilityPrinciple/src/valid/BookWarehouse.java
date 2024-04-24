package valid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookWarehouse {
    private List<Book> books = new ArrayList<>();
    public Book searchBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    public void addBook(String name, String author, Date publishedOn, String id) {
        books.add(new Book(name,author,publishedOn,id));
    }
    public Book removeBook(String id) {
        Book foundBook = searchBook(id);
        books.remove(foundBook);
        return foundBook;
    }
}
