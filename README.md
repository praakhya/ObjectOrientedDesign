SOLID is an acronym for 5 design principles that leads to flexible and stable software thats easier to maintain and extend and less likely to break.
They help in reducing dependencies and achieving low coupling and high cohesion.
# SOLID Design Principles
## Single Responsibility Principle
**Every module should have responsibility over a single feature of the system**
```java
public class Book {  
    //First responsibility of Book : Set values of Book objects  
    private String name;  
    private String author;  
    private Date publishedOn;  
    private String id;  
    private List<Book> books;  
    public Book(String name, String author, Date publishedOn, String id) {...}  
    public String getName() {...}  
    public String getAuthor() {...}  
    public Date getPublishedOn() {...}  
    public String getId() {...}  
    //Second Responsibility of Book : modifying collection of books (incorrect)  
    public Book searchBook(String id) {...}  
    public void addBook(String name, String author, Date publishedOn, String id) {...}  
    public Book removeBook(String id) {...}  
}
```
```mermaid
classDiagram  
    class Book {  
        -String name;  
        -String author;  
        -Date publishedOn;  
        -String id;  
        -List<Book> books;  
        +Book(String name, String author, Date publishedOn, String id)  
        +getName()String  
        +getAuthor()String  
        +getPublishedOn()Date  
        +getId()String  
        +searchBook(String id)Book  
        +addBook(String name, String author, Date publishedOn, String id)  
        +removeBook(String id)Book  
    }
```
```java
public class Book {  
    //First responsibility of Book : Set values of Book objects  
    private String name;  
    private String author;  
    private Date publishedOn;  
    private String id;  
    public Book(String name, String author, Date publishedOn, String id) {...}  
    public String getName() {...}  
    public String getAuthor() {...}  
    public Date getPublishedOn() {...}  
    public String getId() {...}  
}

//The second responsibility is put in a different class
public class BookShelf {  
    private List<Book> books = new ArrayList<>();  
    public Book searchBook(String id) {...}  
    public void addBook(String name, String author, Date publishedOn, String id) {...}  
    public Book removeBook(String id) {...}  
}
```
```mermaid
classDiagram  
    class Book {  
        -String name;  
        -String author;  
        -Date publishedOn;  
        -String id;  
        +Book(String name, String author, Date publishedOn, String id)  
        +getName()String  
        +getAuthor()String  
        +getPublishedOn()Date  
        +getId()String  
    }  
    class BookShelf {  
        -List<Book> books  
        +searchBook(String id) Book  
        +addBook(String name, String author, Date publishedOn, String id)  
        +removeBook(String id)Book  
    }  
    BookShelf *-- Book
```
### Advantages
- The number of test cases decreases
- Lower coupling due to fewer dependencies
- Smaller classes are easier to search than bigger monolithic ones


## Open Closed Principle
It states that classes, modules, microservices, and other code units should be **open for extension but closed for modification**.
We should be able to extend the existing code using OOP features like inheritance via subclasses and interfaces.
While adding  a new feature extend the code rather than modifying it, so that the risk of failure is minimised.
```mermaid
classDiagram  
class BookWarehouse {  
    deliverDigitalBook(DigitalBookInterface digitalBookInterface)  
    deliverPaperbackBook(PaperbackBookInterface paperbackBookInterface)  
}  
class DigitalBookInterface{  
    deliver()  
}  
class PaperbackBookInterface{  
    deliver()  
}  
  
BookWarehouse --> DigitalBookInterface  
BookWarehouse --> PaperbackBookInterface
```

```mermaid
classDiagram  
class BookWarehouse {  
    deliverBook(BookInterface bookInterface)  
}  
class BookInterface {  
    deliver()  
}  
class DigitalBookInterface{  
    deliver()  
}  
class PaperbackBookInterface{  
    deliver()  
}  
  
<<interface>> BookInterface  
BookInterface <|.. DigitalBookInterface  
BookInterface <|.. PaperbackBookInterface  
BookWarehouse --> BookInterface
```



## Liskov Substitution Principle
An object of a superclass should be replaceable by objects of its subclasses without causing issues in the application. 
- A child class should never change the characteristics of its parent class
- Derived classes should never do less than their base class
## Interface Segregation Principle
A class should not be forced to implement interfaces that it does not need to. To allow this interfaces should be split into smaller ones.
```mermaid

classDiagram  
note "Triangle is forced to implement getVolume()
and Sphere is forced to implement getPerimeter()
when it does not make sense"
class Shape {  
    getArea()Double  
    getPerimeter()Double  
    getVolume()Double  
}  
class Sphere {  
    Double radius;  
    +getArea()Double  
    +getVolume()Double  
}  
class Triangle{  
    Double s1  
    Double s2  
    Double s3  
    +getArea()Double  
    +getPerimeter()Double  
}  
  
<<interface>> Shape  
Shape <|.. Triangle  
Shape <|.. Sphere
```

```mermaid
classDiagram
note "Triangle and Sphere can now
only implement those methods that 
are relevant to them"
class Shape {  
    getArea()Double  
}  
class Shape2D {  
    getArea()Double  
    getPerimeter()Double  
}  
class Shape3D {  
    getArea()Double  
    getVolume()Double  
}  
class Sphere {  
    Double radius;  
    +getArea()Double  
    +getVolume()Double  
}  
class Triangle{  
    Double s1  
    Double s2  
    Double s3  
    +getArea()Double  
    +getPerimeter()Double  
}  
  
<<interface>> Shape  
<<interface>> Shape2D  
<<interface>> Shape3D  
Shape <|-- Shape2D  
Shape <|-- Shape3D  
Shape2D <|.. Triangle  
Shape3D <|.. Sphere
```
## Dependency Inversion Principle
High level modules should not depend on low level modules, both should depend upon abstractions.
Dependency Inversion Principle is a specific combination of the Open-Closed and Liskov Substitution Principles.
This principle helps in separating the presentation layer, business layer and data access layer of the software.
```mermaid
classDiagram
note "The Library class can now only add books and no other media
because it is highly dependent on the Book class"
class Book
class Library {
	List<Book> books
	addBook(Book book)
}
Library *-- Book
```

```mermaid
classDiagram
note "The Library class can now add 'Media' which 
is in the form of Books, DVDs etc."
class Book
class DVD
class Media
class Library {
	List<Media> media
	add(Media media)
}
Media <|--Book
Media <|--DVD
Library *-- Media
```



