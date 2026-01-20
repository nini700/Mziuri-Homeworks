package savarjisho3;

public class Main {
    public static void main(String[] args) {
        Produkti[] produktebi = new Produkti[5];

        produktebi[0] = new Rdze(3.50, "2025-12-15", 1.0);
        produktebi[1] = new Rdze(2.80, "2025-12-10", 0.5);
        produktebi[2] = new Namcxvari(1.20, "2025-12-20", 0.3);
        produktebi[3] = new Namcxvari(2.50, "2025-12-25", 0.5);
        produktebi[4] = new Sendvichi(5.00, "2025-12-09", 15.0);

        Magazia magazia = new Magazia(produktebi);

        System.out.println("Magaziashi aris " + magazia.getProduktebi().length + " produkti");
    }
}