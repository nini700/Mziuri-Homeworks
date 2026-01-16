class Reindeer extends WorkshopMember {
    private double flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, double flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " daprinda sichqarit " + flyingSpeed + " km/st!");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " varjishobs shobishvis!");
        flyingSpeed = flyingSpeed + 5;
    }

    public String checkFitnessLevel() {
        double fitness = flyingSpeed - (getAge() * 2);

        if (fitness >= 90) {
            return "A";
        } else if (fitness >= 80) {
            return "B";
        } else if (fitness >= 70) {
            return "C";
        } else if (fitness >= 60) {
            return "D";
        } else if (fitness >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reindeer reindeer = (Reindeer) o;
        if (getName().equals(reindeer.getName()) && noseColor.equals(reindeer.noseColor)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = getName().hashCode();
        result = result + noseColor.hashCode() * 31;
        return result;
    }

    public String toString() {
        return "Reindeer{name='" + getName() + "', age=" + getAge() + ", flyingSpeed=" + flyingSpeed + ", noseColor='" + noseColor + "'}";
    }
}