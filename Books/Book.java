import java.util.Scanner;

public class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.yearPublished = 0;
    }

    // Parameterized Constructor
    public Book(String title, String author, int yearPublished) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYearPublished(yearPublished);
    }

    // Methods
    public void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("---------------------");
    }

    public void modifyBookDetails(Scanner scanner) {
        System.out.print("\nModify Title: ");
        String newTitle = scanner.nextLine();

        System.out.print("Modify Author: ");
        String newAuthor = scanner.nextLine();

        System.out.print("Modify Year Published: ");
        int newYearPublished = scanner.nextInt();
        scanner.nextLine();

        setTitle(newTitle);
        setAuthor(newAuthor);
        setYearPublished(newYearPublished);
    }

    // Getters
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getYearPublished() {return yearPublished;}

    // Setters
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setYearPublished(int yearPublished) {
        if(yearPublished >= 0) {
            this.yearPublished = yearPublished;
        } else {
            System.out.println("\n> Invalid year published!");
        }
    }
}