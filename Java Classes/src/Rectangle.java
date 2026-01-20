public class Rectangle {

    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }


    public double area() {
        return length * width;
    }
    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }
    public boolean isSquare() {
        return length == width;
    }

    public void displayInfo() {
        System.out.println("martkutxedze info");
        System.out.println("sigrde: " + length);
        System.out.println("sigane: " + width);
        System.out.println("perimetri: " + perimeter());
        System.out.println("fartobi: " + area());
        System.out.println("diagonali: " + diagonal());
        System.out.println("kvadratia?: " + (isSquare() ? "ki" : "ara"));
        System.out.println();
    }
}