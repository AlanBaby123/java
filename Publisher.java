import java.util.Scanner;

// Publisher class
class Publisher {
    private String name;

    // Constructor
    public Publisher(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

// Book class
class Book {
    private String title;
    private Publisher publisher;
    private int year;

    // Constructor
    public Book(String title, Publisher publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }
}

// Literature class (subclass of Book)
class Literature extends Book {
    private String genre;

    // Constructor
    public Literature(String title, Publisher publisher, int year, String genre) {
        super(title, publisher, year);
        this.genre = genre;
    }

    // Getter method
    public String getGenre() {
        return genre;
    }
}

// Fiction class (subclass of Book)
class Fiction extends Book {
    private String subgenre;

    // Constructor
    public Fiction(String title, Publisher publisher, int year, String subgenre) {
        super(title, publisher, year);
        this.subgenre = subgenre;
    }

    // Getter method
    public String getSubgenre() {
        return subgenre;
    }
}

class Main {
    public static void main(String[] args) {
        // Creating instances of books
        Publisher publisher1 = new Publisher("Publisher A");
        Publisher publisher2 = new Publisher("Publisher B");
        
        Literature literatureBook = new Literature("Literature Book", publisher1, 2020, "Classic");
        Fiction fictionBook = new Fiction("Fiction Book", publisher2, 2018, "Science Fiction");

        // Printing details of the books
        System.out.println("Literature Book:");
        printBookDetails(literatureBook);
        
        System.out.println("\nFiction Book:");
        printBookDetails(fictionBook);
    }

    // Method to print book details
    public static void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Publisher: " + book.getPublisher().getName());
        System.out.println("Year: " + book.getYear());
        
        if (book instanceof Literature) {
            Literature literatureBook = (Literature) book;
            System.out.println("Genre: " + literatureBook.getGenre());
        } else if (book instanceof Fiction) {
            Fiction fictionBook = (Fiction) book;
            System.out.println("Subgenre: " + fictionBook.getSubgenre());
        }
    }
}

output
mlm@mlm-H81:~/Documents/javaa$ javac Publisher.java
mlm@mlm-H81:~/Documents/javaa$ java Publisher
Error: Main method not found in class Publisher, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
mlm@mlm-H81:~/Documents/javaa$ ls
Book.class        Person.class     Shapes.class      shapessDemo.class
Employee.class    person.java      ShapesDemo.class  ShapessDemo.class
Fiction.class     Person.java      Shapes.java       shapess.java
Literature.class  Publisher.class  shapess.class     Teacher.class
Main.class        Publisher.java   Shapess.class
mlm@mlm-H81:~/Documents/javaa$ java Main
Literature Book:
Title: Literature Book
Publisher: Publisher A
Year: 2020
Genre: Classic

Fiction Book:
Title: Fiction Book
Publisher: Publisher B
Year: 2018
Subgenre: Science Fiction
mlm@mlm-H81:~/Documents/javaa$ 
