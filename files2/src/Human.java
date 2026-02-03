public class Human {
    private String name;
    private String surname;
    private int age;
    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void walk() {
        System.out.println(name + " სეირნობს");
    }

    public void hangOut(Human other) {
        System.out.println(this.name + " is hanging out with " + other.name);
    }
}
