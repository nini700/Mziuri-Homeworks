public class Davaleba4 {
    public static void main(String[] args) {
        Library library = new Library();
        library.populateList();

        System.out.println("=== ბიბლიოთეკის წიგნები ===");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}