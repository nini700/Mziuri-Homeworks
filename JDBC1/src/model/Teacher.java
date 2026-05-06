package model;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int subject;
    private double salary;

    public Teacher(int id, String firstName, String lastName, int subject, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSubject() { return subject; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSubject(int subject) { this.subject = subject; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return id + "\t" + firstName + "\t" + lastName + "\t" + subject + "\t" + salary;
    }
}