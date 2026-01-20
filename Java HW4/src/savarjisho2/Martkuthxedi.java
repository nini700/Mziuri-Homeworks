package savarjisho2;

public class Martkuthxedi extends Pigura {
    private double sigrze;
    private double sigane;

    public Martkuthxedi(double sigrze, double sigane) {
        this.sigrze = sigrze;
        this.sigane = sigane;
    }

    public double getSigrze() {
        return sigrze;
    }

    public void setSigrze(double sigrze) {
        this.sigrze = sigrze;
    }

    public double getSigane() {
        return sigane;
    }

    public void setSigane(double sigane) {
        this.sigane = sigane;
    }

    @Override
    public double getArea() {
        return sigrze * sigane;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sigrze + sigane);
    }

    public double getDiagonali() {
        return Math.sqrt(sigrze * sigrze + sigane * sigane);
    }
}