package savarjisho4;

public class SamecnieroWigni extends Wigni {
    private String mecnierebisSpero;

    public SamecnieroWigni(String satauri, int gverdebisRaodenoba, String avtori, boolean myariYdiani, String mecnierebisSpero) {
        super(satauri, gverdebisRaodenoba, avtori, myariYdiani);
        this.mecnierebisSpero = mecnierebisSpero;
    }

    public String getMecnierebisSpero() {
        return mecnierebisSpero;
    }

    public void setMecnierebisSpero(String mecnierebisSpero) {
        this.mecnierebisSpero = mecnierebisSpero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipi: Samecniero, Spero: " + mecnierebisSpero;
    }
}