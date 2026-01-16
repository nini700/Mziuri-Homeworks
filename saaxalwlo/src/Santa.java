import java.util.ArrayList;
import java.util.List;

class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<Child>();
    }

    public void deliverGifts() {
        List<Child> niceChildren = checkNaughtyOrNiceList();
        System.out.println("\n" + getName() + " urigebs sachukrebs!");
        for (int i = 0; i < niceChildren.size(); i++) {
            Child child = niceChildren.get(i);
            System.out.println("sachukari " + child.getName() + "-stvis: " + child.getWishList());
        }
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<Child>();
        System.out.println("\n" + getName() + " amowmebs bavshvebis sias...");

        for (int i = 0; i < childrenList.size(); i++) {
            Child child = childrenList.get(i);
            if (child.getBehaviorScore() > 5) {
                niceChildren.add(child);
                System.out.println(child.getName() + " - kargi bavshvi! (qula: " + child.getBehaviorScore() + ")");
            } else {
                System.out.println(child.getName() + " - tsudi bavshvi! (qula: " + child.getBehaviorScore() + ")");
            }
        }
        return niceChildren;
    }

    public void spreadJoy() {
        System.out.println(getName() + " avrcelebs sixaruls!");
    }

    public void singCarols() {
        System.out.println(getName() + " mgheris sashabao simgherebs!");
    }

    public void decorateTree() {
        System.out.println(getName() + " amshvenebs nadzvis xes!");
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    public void addChild(Child child) {
        childrenList.add(child);
    }
}