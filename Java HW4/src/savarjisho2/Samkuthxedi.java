package savarjisho2;

public class Samkuthxedi extends Pigura {
    private double gverdi1;
    private double gverdi2;
    private double gverdi3;

    public Samkuthxedi(double gverdi1, double gverdi2, double gverdi3) {
        this.gverdi1 = gverdi1;
        this.gverdi2 = gverdi2;
        this.gverdi3 = gverdi3;
    }

    public double getGverdi1() {
        return gverdi1;
    }

    public void setGverdi1(double gverdi1) {
        this.gverdi1 = gverdi1;
    }

    public double getGverdi2() {
        return gverdi2;
    }

    public void setGverdi2(double gverdi2) {
        this.gverdi2 = gverdi2;
    }

    public double getGverdi3() {
        return gverdi3;
    }

    public void setGverdi3(double gverdi3) {
        this.gverdi3 = gverdi3;
    }

    @Override
    public double getPerimeter() {
        return gverdi1 + gverdi2 + gverdi3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - gverdi1) * (s - gverdi2) * (s - gverdi3));
    }
}