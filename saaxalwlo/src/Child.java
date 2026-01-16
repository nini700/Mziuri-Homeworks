import java.util.ArrayList;
import java.util.List;

class Child {
    private String name;
    private int behaviorScore;
    private List<String> wishList;

    public Child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishList = new ArrayList<String>();
    }

    public void addWish(String wish) {
        wishList.add(wish);
        System.out.println(name + "-ma daamata survili: " + wish);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public void setBehaviorScore(int behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Child child = (Child) o;
        if (behaviorScore == child.behaviorScore && name.equals(child.name)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = name.hashCode();
        result = result + behaviorScore * 31;
        return result;
    }

    public String toString() {
        return "Child{name='" + name + "', behaviorScore=" + behaviorScore + ", wishList=" + wishList + "}";
    }
}