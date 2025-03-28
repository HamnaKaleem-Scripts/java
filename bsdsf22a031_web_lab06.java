import java.io.*;
import java.util.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
class LibraryManager {
    private HashMap<Integer, Book> books = new HashMap<>();

    public void addBook(int id, String title, String author) {
        if (books.containsKey(id)) {
            
			System.out.println("Book ID already exists!");
        } else {
            books.put(id, new Book(id, title, author));
        }
    }
    public void borrowBook(int id) {
        Book book = books.get(id);
        if (book != null && book.isAvailable) {
            book.isAvailable = false;
            System.out.println("Book borrowed: " + book.title);
        } else {
            System.out.println("Book not available or does not exist.");
        }
    }
    public void returnBook(int id) {
        Book book = books.get(id);
        if (book != null && !book.isAvailable) {
            book.isAvailable = true;
            System.out.println("Book returned: " + book.title);
        } else {
            System.out.println("Book is already available or does not exist.");
        }
    }
    public void displayBooks() {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(books);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            books = (HashMap<Integer, Book>) ois.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

public class Library_system {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook(1, "Java Programming", "John Doe");
        library.addBook(2, "Data Structures", "Jane Smith");
        library.addBook(3, "Algorithms", "Robert Martin");

        System.out.println("\nBooks in library:");
        library.displayBooks();

        System.out.println("\nBorrowing book with ID 2...");
        library.borrowBook(2);
        library.displayBooks();

        System.out.println("\nReturning book with ID 2...");
        library.returnBook(2);
        library.displayBooks();

        String filename = "library_data.ser";
        library.saveToFile(filename);
        
        LibraryManager newLibrary = new LibraryManager();
        newLibrary.loadFromFile(filename);
        System.out.println("\nBooks after loading from file:");
        newLibrary.displayBooks();
    }
}
