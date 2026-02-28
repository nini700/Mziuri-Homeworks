public class Car3 {
    private String marka;
    private String modeli;
    private int gamoshvebisweli;
    private int garbeni;
    private Engine dzravi;

    public Car3(String marka, String modeli, int gamoshvebisweli, int garbeni, Engine dzravi) {
        this.marka = marka;
        this.modeli = modeli;
        this.gamoshvebisweli = gamoshvebisweli;
        this.garbeni = garbeni;
        this.dzravi = dzravi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModeli() {
        return modeli;
    }

    public int getGamoshvebisweli() {
        return gamoshvebisweli;
    }

    public int getGarbeni() {
        return garbeni;
    }

    public Engine getDzravi() {
        return dzravi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", modeli='" + modeli + '\'' +
                ", weli=" + gamoshvebisweli +
                ", garbeni=" + garbeni +
                ", dzravi=" + dzravi +
                '}';
    }
}