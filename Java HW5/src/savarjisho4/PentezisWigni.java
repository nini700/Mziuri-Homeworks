package savarjisho4;

public class PentezisWigni extends Wigni {
    private String qveyana;

    public PentezisWigni(String satauri, int gverdebisRaodenoba, String avtori, boolean myariYdiani, String qveyana) {
        super(satauri, gverdebisRaodenoba, avtori, myariYdiani);
        this.qveyana = qveyana;
    }

    public String getQveyana() {
        return qveyana;
    }

    public void setQveyana(String qveyana) {
        this.qveyana = qveyana;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipi: Pentezi, Qveynis Mitologia: " + qveyana;
    }
}