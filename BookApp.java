// Problem 19: Library storing multiple books

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

// Main class (not public, so file name can be anything)
public class BookApp {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = {
            new Book("The Alchemist", "Paulo Coelho", 399.0),
            new Book("Wings of Fire", "A.P.J. Abdul Kalam", 250.0),
            new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 499.0),
            new Book("Java Programming", "Herbert Schildt", 799.0)
        };

        // Display details of all books
        System.out.println("Library Book List:");
        for (Book b : books) {
            b.displayDetails();
        }
    }
}


