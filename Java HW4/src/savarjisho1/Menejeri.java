package savarjisho1;

public class Menejeri extends Tanamsromeli {
    private String menejeriID;

    public Menejeri(String saxeli, String gvari, int asaki, String tanamsromeliID, String menejeriID) {
        super(saxeli, gvari, asaki, tanamsromeliID);
        this.menejeriID = menejeriID;
    }

    public String getMenejeriID() {
        return menejeriID;
    }

    public void setMenejeriID(String menejeriID) {
        this.menejeriID = menejeriID;
    }
}