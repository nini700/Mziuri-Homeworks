import java.util.Comparator;

public class StudentBirthDateComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getDabadebisTariRi().compareTo(o2.getDabadebisTariRi());
    }
}