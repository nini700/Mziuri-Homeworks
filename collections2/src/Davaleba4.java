import java.util.ArrayList;
import java.util.Collections;

public class Davaleba4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("001", "nini", "badridze");
        student1.addGrade("matematika", 9);
        student1.addGrade("qartuli", 10);

        Student student2 = new Student("002", "ana", "kvaratskhelia");
        student2.addGrade("matematika", 10);
        student2.addGrade("kartuli", 9);

        Student student3 = new Student("003", "mari", "babutsidze");
        student3.addGrade("matematika", 7);
        student3.addGrade("qartuli", 8);

        Student student4 = new Student("004", "zurab", "geladze");
        student4.addGrade("matematika", 8);
        student4.addGrade("qartuli", 9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("originali:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("\ndavalagot sashualo qulit:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new StudentLastNameComparator());
        System.out.println("\ndavalagot gvarit:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
