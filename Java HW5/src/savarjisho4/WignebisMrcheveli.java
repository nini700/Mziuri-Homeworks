package savarjisho4;

import java.util.Random;

public class WignebisMrcheveli extends BibliotekisTanamsromeli {
    private double rchevisReitingi;
    private Biblioteka biblioteka;

    public WignebisMrcheveli(String saxeli, String gvari, String ID, double rchevisReitingi) {
        super(saxeli, gvari, ID);
        this.rchevisReitingi = rchevisReitingi;
    }

    public double getRchevisReitingi() {
        return rchevisReitingi;
    }

    public void setRchevisReitingi(double rchevisReitingi) {
        this.rchevisReitingi = rchevisReitingi;
    }

    public Biblioteka getBiblioteka() {
        return biblioteka;
    }

    public void setBiblioteka(Biblioteka biblioteka) {
        this.biblioteka = biblioteka;
    }

    public Wigni mirchieWigni() {
        if (biblioteka == null || biblioteka.getWignebi() == null || biblioteka.getWignebi().length == 0) {
            System.out.println("Bibliotekashi ar aris wignebi!");
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(biblioteka.getWignebi().length);
        return biblioteka.getWignebi()[index];
    }

    @Override
    public String toString() {
        return super.toString() + ", Rchevis Reitingi: " + rchevisReitingi;
    }
}