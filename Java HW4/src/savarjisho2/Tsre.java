package savarjisho2;

public class Tsre extends Pigura {
    private double radiusi;

    public Tsre(double radiusi) {
        this.radiusi = radiusi;
    }

    public double getRadiusi() {
        return radiusi;
    }

    public void setRadiusi(double radiusi) {
        this.radiusi = radiusi;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusi * radiusi;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radiusi;
    }
}