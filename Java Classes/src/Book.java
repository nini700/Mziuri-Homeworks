public class Book {

    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }
    public void displayBookInfo() {
        System.out.println("wignze info");
        System.out.println("satauri: " + title);
        System.out.println("avtori: " + author);
        System.out.println("gverdebis raodenoba: " + pages);
        System.out.println();
    }
}