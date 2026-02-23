import java.util.HashMap;
import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> grades;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public HashMap<String, ArrayList<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, ArrayList<Integer>> grades) {
        this.grades = grades;
    }

    public void addGrade(String subject, int grade) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    public double getAverageGrade() {
        int totalGrades = 0;
        int count = 0;

        for (String subject : grades.keySet()) {
            ArrayList<Integer> subjectGrades = grades.get(subject);
            for (int grade : subjectGrades) {
                totalGrades += grade;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) totalGrades / count;
    }

    @Override
    public int compareTo(Student o) {
        double thisAverage = this.getAverageGrade();
        double otherAverage = o.getAverageGrade();

        if (thisAverage > otherAverage) {
            return 1;
        } else if (thisAverage == otherAverage) {
            return 0;
        } else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }
}