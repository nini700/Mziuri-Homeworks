public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("ვეფხისტყაოსანი", "შოთა რუსთაველი", 1650);
        Book book2 = new Book("მოთხრობები", "ილია ჭავჭავაძე", 320);

        book1.displayBookInfo();
        book2.displayBookInfo();
        Book book3 = new Book("new book", "unknown author");
        book3.displayBookInfo();
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0, 4.0);
        Rectangle rect3 = new Rectangle(7.5, 2.5);

        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();


        //5
        Time time1 = new Time(14, 30, 45);
        Time time2 = new Time(9, 5, 20);
        Time time3 = new Time(23, 59, 59);

        System.out.print("dro 1 (HH:MM:SS): ");
        time1.displayTime();

        System.out.print("dro 1 (HH:MM): ");
        time1.displayTimeShort();

        System.out.println();

        System.out.print("dro 2 (HH:MM:SS): ");
        time2.displayTime();

        System.out.print("dro 2 (HH:MM): ");
        time2.displayTimeShort();

        System.out.println();

        System.out.print("dro 3 (HH:MM:SS): ");
        time3.displayTime();

        System.out.print("dro 3 (HH:MM): ");
        time3.displayTimeShort();
    }
}