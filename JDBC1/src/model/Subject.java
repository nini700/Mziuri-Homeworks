package model;

public class Subject {
    private int id;
    private String subjectName;

    public Subject(int id, String subjectName) {
        this.id = id;
        this.subjectName = subjectName;
    }

    public int getId() { return id; }
    public String getSubjectName() { return subjectName; }

    public void setId(int id) { this.id = id; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    @Override
    public String toString() {
        return id + "\t" + subjectName;
    }
}