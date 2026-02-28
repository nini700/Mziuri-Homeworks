import java.util.Comparator;

public class StudentAverageComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        double sash1 = o1.getSashualoQula();
        double sash2 = o2.getSashualoQula();

        if (sash1 > sash2) {
            return -1;
        } else if (sash1 < sash2) {
            return 1;
        }
        return 0;
    }
}