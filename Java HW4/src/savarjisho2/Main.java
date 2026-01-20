package savarjisho2;

public class Main {
    public static void main(String[] args) {
        Tsre tsre = new Tsre(5.0);
        System.out.println("Tsre:");
        System.out.println("Fartobi: " + tsre.getArea());
        System.out.println("Perimetri: " + tsre.getPerimeter());

        Martkuthxedi martkuthxedi = new Martkuthxedi(4.0, 6.0);
        System.out.println("\nMartkuthxedi:");
        System.out.println("Fartobi: " + martkuthxedi.getArea());
        System.out.println("Perimetri: " + martkuthxedi.getPerimeter());
        System.out.println("Diagonali: " + martkuthxedi.getDiagonali());

        Samkuthxedi samkuthxedi = new Samkuthxedi(3.0, 4.0, 5.0);
        System.out.println("\nSamkuthxedi:");
        System.out.println("Fartobi: " + samkuthxedi.getArea());
        System.out.println("Perimetri: " + samkuthxedi.getPerimeter());
    }
}