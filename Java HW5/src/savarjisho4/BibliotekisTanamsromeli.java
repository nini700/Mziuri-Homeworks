package savarjisho4;

public class BibliotekisTanamsromeli {
    private String saxeli;
    private String gvari;
    private String ID;

    public BibliotekisTanamsromeli(String saxeli, String gvari, String ID) {
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.ID = ID;
    }

    public String getSaxeli() {
        return saxeli;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public String getGvari() {
        return gvari;
    }

    public void setGvari(String gvari) {
        this.gvari = gvari;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Tanamsromeli: " + saxeli + " " + gvari + ", ID: " + ID;
    }
}