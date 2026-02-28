public class BasketballPlayer implements Comparable<BasketballPlayer> {
    private String saxeli;
    private String gvari;
    private int chagebuliBurtebi;
    private int moxsnebi;
    private int dafarebebi;
    private int gadacemebi;
    private int dakargulebi;
    public BasketballPlayer(String saxeli, String gvari, int chagebuliBurtebi,
                            int moxsnebi, int dafarebebi, int gadacemebi, int dakargulebi) {
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.chagebuliBurtebi = chagebuliBurtebi;
        this.moxsnebi = moxsnebi;
        this.dafarebebi = dafarebebi;
        this.gadacemebi = gadacemebi;
        this.dakargulebi = dakargulebi;
    }

    public String getSaxeli() {
        return saxeli;
    }
    public String getGvari() {
        return gvari;
    }
    public int getChagebuliBurtebi() {
        return chagebuliBurtebi;
    }
    public int getMoxsnebi() {
        return moxsnebi;
    }
    public int getDafarebebi() {
        return dafarebebi;
    }
    public int getGadacemebi() {
        return gadacemebi;
    }
    public int getDakargulebi() {
        return dakargulebi;
    }



    public double getReitingi() {
        double reitingi = 0.0;
        reitingi += chagebuliBurtebi * 1.0;
        reitingi += moxsnebi * 1.0;
        reitingi += dafarebebi * 2.0;
        reitingi += gadacemebi * 1.5;
        reitingi += dakargulebi * (-2.0);
        return reitingi;
    }

    @Override
    public int compareTo(BasketballPlayer o) {
        double esReitingi = this.getReitingi();
        double isReitingi = o.getReitingi();

        if (esReitingi > isReitingi) {
            return 1;
        } else if (esReitingi < isReitingi) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "saxeli='" + saxeli + " " + gvari + '\'' +
                ", reitingi=" + String.format("%.1f", getReitingi()) +
                ", chagebuli=" + chagebuliBurtebi +
                ", moxsnebi=" + moxsnebi +
                ", dafarebebi=" + dafarebebi +
                ", gadacemebi=" + gadacemebi +
                ", dakarguli=" + dakargulebi +
                '}';
    }
}