package savarjisho4;

public class Biblioteka {
    private String saxeli;
    private BibliotekisTanamsromeli[] tanamsromlebi;
    private Wigni[] wignebi;

    public Biblioteka(String saxeli, BibliotekisTanamsromeli[] tanamsromlebi, Wigni[] wignebi) {
        this.saxeli = saxeli;
        this.tanamsromlebi = tanamsromlebi;
        this.wignebi = wignebi;
    }

    public String getSaxeli() {
        return saxeli;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public BibliotekisTanamsromeli[] getTanamsromlebi() {
        return tanamsromlebi;
    }

    public void setTanamsromlebi(BibliotekisTanamsromeli[] tanamsromlebi) {
        this.tanamsromlebi = tanamsromlebi;
    }

    public Wigni[] getWignebi() {
        return wignebi;
    }

    public void setWignebi(Wigni[] wignebi) {
        this.wignebi = wignebi;
    }

    @Override
    public String toString() {
        return "Biblioteka: " + saxeli + ", Tanamsromlebi: " + tanamsromlebi.length + ", Wignebi: " + wignebi.length;
    }
}