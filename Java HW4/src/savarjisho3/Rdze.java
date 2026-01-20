package savarjisho3;

public class Rdze extends Produkti {
    private double moculoba;

    public Rdze(double pasi, String vada, double moculoba) {
        super(pasi, vada);
        this.moculoba = moculoba;
    }

    public double getMoculoba() {
        return moculoba;
    }

    public void setMoculoba(double moculoba) {
        this.moculoba = moculoba;
    }
}