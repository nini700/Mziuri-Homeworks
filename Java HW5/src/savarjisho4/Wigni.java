package savarjisho4;

public class Wigni {
    private String satauri;
    private int gverdebisRaodenoba;
    private String avtori;
    private boolean myariYdiani;

    public Wigni(String satauri, int gverdebisRaodenoba, String avtori, boolean myariYdiani) {
        this.satauri = satauri;
        this.gverdebisRaodenoba = gverdebisRaodenoba;
        this.avtori = avtori;
        this.myariYdiani = myariYdiani;
    }

    public String getSatauri() {
        return satauri;
    }

    public void setSatauri(String satauri) {
        this.satauri = satauri;
    }

    public int getGverdebisRaodenoba() {
        return gverdebisRaodenoba;
    }

    public void setGverdebisRaodenoba(int gverdebisRaodenoba) {
        this.gverdebisRaodenoba = gverdebisRaodenoba;
    }

    public String getAvtori() {
        return avtori;
    }

    public void setAvtori(String avtori) {
        this.avtori = avtori;
    }

    public boolean isMyariYdiani() {
        return myariYdiani;
    }

    public void setMyariYdiani(boolean myariYdiani) {
        this.myariYdiani = myariYdiani;
    }

    public void wakitxva() {
        System.out.println("Me vkitxulob " + satauri + " wigns");
    }

    @Override
    public String toString() {
        return "Wigni: " + satauri + ", Avtori: " + avtori + ", Gverdebi: " + gverdebisRaodenoba;
    }
}