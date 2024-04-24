package valid;
import java.util.Date;
import java.util.List;

public class Book {
    //First responsibility of Book : Set values of Book objects
    private String name;
    private String author;
    private Date publishedOn;
    private String id;
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

}
