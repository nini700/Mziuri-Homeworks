package savarjisho3;

public class Produkti {
    private double pasi;
    private String vada;

    public Produkti(double pasi, String vada) {
        this.pasi = pasi;
        this.vada = vada;
    }

    public double getPasi() {
        return pasi;
    }

    public void setPasi(double pasi) {
        this.pasi = pasi;
    }

    public String getVada() {
        return vada;
    }

    public void setVada(String vada) {
        this.vada = vada;
    }
}