import java.util.Scanner;

public class App {
    public static Book promptBookDetails(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, yearPublished);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = promptBookDetails(scanner);
        book.displayDetails();
        book.modifyBookDetails(scanner);
        book.displayDetails();
        System.out.print("\nBook details modified succesfuly!");

        scanner.close();
    }
}