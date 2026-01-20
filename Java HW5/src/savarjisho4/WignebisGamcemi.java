package savarjisho4;

public class WignebisGamcemi extends BibliotekisTanamsromeli {
    private int saatiDan;
    private int saatamde;

    public WignebisGamcemi(String saxeli, String gvari, String ID, int saatiDan, int saatamde) {
        super(saxeli, gvari, ID);
        this.saatiDan = saatiDan;
        this.saatamde = saatamde;
    }

    public int getSaatiDan() {
        return saatiDan;
    }

    public void setSaatiDan(int saatiDan) {
        this.saatiDan = saatiDan;
    }

    public int getSaatamde() {
        return saatamde;
    }

    public void setSaatamde(int saatamde) {
        this.saatamde = saatamde;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gamcemi: " + saatiDan + ":00-dan " + saatamde + ":00-mde";
    }
}