package invalid;
import java.util.Date;
import java.util.List;
public class Book {
    //First responsibility of Book : Set values of Book objects
    private String name;
    private String author;
    private Date publishedOn;
    private String id;
    private List<Book> books;
    public Book(String name, String author, Date publishedOn, String id) {
        this.name = name;
        this.author = author;
        this.publishedOn = publishedOn;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public Date getPublishedOn() {
        return publishedOn;
    }
    public String getId() {
        return id;
    }
    //Second Responsibility of Book : modifying collection of books (incorrect)
    public Book searchBook(String id) {
        for (Book book : books) {
            if (book.id.equals(id)) {
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
