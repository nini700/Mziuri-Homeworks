import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Davaleba2 {
    public static void main(String[] args) {
        ArrayList<Student2> studentebi = new ArrayList<>();


        Student2 s1 = new Student2("Giorgi", "geladze", new Date(105, 5, 15));
        s1.daamateQula(9);
        s1.daamateQula(8);
        s1.daamateQula(10);
        s1.daamateQula(7);

        Student2 s2 = new Student2("aleko", "manjgalauri", new Date(104, 3, 20));
        s2.daamateQula(10);
        s2.daamateQula(10);
        s2.daamateQula(9);
        s2.daamateQula(10);

        Student2 s3 = new Student2("Davit", "wurwumia", new Date(105, 8, 10));
        s3.daamateQula(7);
        s3.daamateQula(8);
        s3.daamateQula(7);
        s3.daamateQula(8);

        Student2 s4 = new Student2("gia", "jajanidze", new Date(106, 1, 5));
        s4.daamateQula(9);
        s4.daamateQula(9);
        s4.daamateQula(8);
        s4.daamateQula(9);

        studentebi.add(s1);
        studentebi.add(s2);
        studentebi.add(s3);
        studentebi.add(s4);

        System.out.println("Daulagebeli:");
        studentebi.forEach(System.out::println);

        Collections.sort(studentebi);
        System.out.println("\nLeqsikografiulad:");
        studentebi.forEach(System.out::println);

        Collections.sort(studentebi, new StudentAverageComparator());
        System.out.println("\nSashualo qulis mikhedvit:");
        studentebi.forEach(System.out::println);

        Collections.sort(studentebi, new StudentBirthDateComparator());
        System.out.println("\nDabadebis tarigis mikhedvit:");
        studentebi.forEach(System.out::println);
    }
}