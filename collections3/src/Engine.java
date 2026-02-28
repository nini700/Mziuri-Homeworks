public class Engine {
    private String sacvavisTipi;
    private int cilindrebi;
    private double moculoba;

    public Engine(String sacvavisTipi, int cilindrebi, double moculoba) {
        this.sacvavisTipi = sacvavisTipi;
        this.cilindrebi = cilindrebi;
        this.moculoba = moculoba;
    }

    public String getSacvavisTipi() {
        return sacvavisTipi;
    }

    public int getCilindrebi() {
        return cilindrebi;
    }

    public double getMoculoba() {
        return moculoba;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "sacvavi='" + sacvavisTipi + '\'' +
                ", cilindrebi=" + cilindrebi +
                ", moculoba=" + moculoba +
                '}';
    }
}