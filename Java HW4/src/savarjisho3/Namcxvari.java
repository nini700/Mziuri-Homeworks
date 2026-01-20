package savarjisho3;

public class Namcxvari extends Produkti {
    private double wona;

    public Namcxvari(double pasi, String vada, double wona) {
        super(pasi, vada);
        this.wona = wona;
    }

    public double getWona() {
        return wona;
    }

    public void setWona(double wona) {
        this.wona = wona;
    }
}