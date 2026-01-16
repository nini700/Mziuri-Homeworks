import java.util.ArrayList;
import java.util.List;

class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = new ArrayList<String>();
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("tovlis babuas daemata: " + accessory);
    }

    public void melt() {
        if (height == 0) {
            System.out.println("tovlis babua ukve dneba!");
            return;
        }

        height = height / 2;
        if (height < 1) {
            height = 0;
        }
        System.out.println("tovlis babua dneba! axali simaghle: " + height);
    }

    public void makeMagical() {
        isMagical = true;
        System.out.println("tovlis babua axla jadosnuria!");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<String> accessories) {
        this.accessories = accessories;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Snowman snowman = (Snowman) o;
        if (Double.compare(snowman.height, height) == 0 && hatColor.equals(snowman.hatColor)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = hatColor.hashCode();
        result = result + (int)(height * 31);
        return result;
    }

    public String toString() {
        return "Snowman{height=" + height + ", hatColor='" + hatColor + "', isMagical=" + isMagical + ", accessories=" + accessories + "}";
    }
}
