package savarjisho1;

public class Tanamsromeli extends Adamiani {
    private String tanamsromeliID;

    public Tanamsromeli(String saxeli, String gvari, int asaki, String tanamsromeliID) {
        super(saxeli, gvari, asaki);
        this.tanamsromeliID = tanamsromeliID;
    }

    public String getTanamsromeliID() {
        return tanamsromeliID;
    }

    public void setTanamsromeliID(String tanamsromeliID) {
        this.tanamsromeliID = tanamsromeliID;
    }
}