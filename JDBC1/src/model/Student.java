package model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;

    public Student(int id, String firstName, String lastName, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getGrade() { return grade; }

    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGrade(int grade) { this.grade = grade; }

    @Override
    public String toString() {
        return id + "\t" + firstName + "\t" + lastName + "\t" + grade;
    }
}