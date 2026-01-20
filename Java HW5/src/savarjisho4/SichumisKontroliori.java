package savarjisho4;

public class SichumisKontroliori extends BibliotekisTanamsromeli {
    private double simkacre;

    public SichumisKontroliori(String saxeli, String gvari, String ID, double simkacre) {
        super(saxeli, gvari, ID);
        this.simkacre = simkacre;
    }

    public double getSimkacre() {
        return simkacre;
    }

    public void setSimkacre(double simkacre) {
        this.simkacre = simkacre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Simkacris done: " + simkacre;
    }
}