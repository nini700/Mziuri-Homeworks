package savarjisho5;

public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(" ბიბლიოთეკის ინფორმაცია ");
        System.out.println("ID: " + id);
        System.out.println("დასახელება: " + name);

        class Book {
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printBookInfo() {
                System.out.println("\nწიგნის ინფორმაცია");
                System.out.println("წიგნის ID: " + bookId);
                System.out.println("წიგნის სახელი: " + bookName);
                System.out.println("ბიბლიოთეკა: " + Library.this.name);
            }
        }

        Book book1 = new Book(101, "ვეფხისტყაოსანი");
        book1.printBookInfo();

        Book book2 = new Book(102, "მთვარის მოტაცება");
        book2.printBookInfo();
    }
}