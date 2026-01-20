package savarjisho3;

public class Sendvichi extends Produkti {
    private double sigrze;

    public Sendvichi(double pasi, String vada, double sigrze) {
        super(pasi, vada);
        this.sigrze = sigrze;
    }

    public double getSigrze() {
        return sigrze;
    }

    public void setSigrze(double sigrze) {
        this.sigrze = sigrze;
    }
}