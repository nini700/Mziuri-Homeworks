import java.util.ArrayList;
import java.util.Collections;

public class Davaleba3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("001", "nini", "badridze");
        student1.addGrade("matematika", 9);
        student1.addGrade("matematika", 8);
        student1.addGrade("qartuli", 10);

        Student student2 = new Student("002", "ana", "kvaratskhelia");
        student2.addGrade("matematika", 10);
        student2.addGrade("matematika", 10);
        student2.addGrade("qartuli", 9);

        Student student3 = new Student("003", "mari", "babutsidze");
        student3.addGrade("matematika", 7);
        student3.addGrade("matematika", 8);
        student3.addGrade("qartuli", 7);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("dalagebamde:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\ndalagebis shemdeg (sashualo qulis mixedvit):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}