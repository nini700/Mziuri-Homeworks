import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList() {
        books = new ArrayList<>();

        try (
                FileInputStream fis = new FileInputStream("books.txt");
                Scanner scanner = new Scanner(fis)
        ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length >= 2) {
                    String name = parts[0];
                    int pages = Integer.parseInt(parts[1]);
                    books.add(new Book(name, pages));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}