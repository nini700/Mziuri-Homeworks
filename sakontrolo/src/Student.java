import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student implements Serializable, Comparable<Student> {
    private static final long serialVersionUID = 1L;
    int aidi;
    String saxeli;
    String gvari;
    int weli;
    double sashualoQula;
    List<String> sagnebi;

    public Student(int aidi, String saxeli, String gvari, int weli, double sashualoQula, List<String> sagnebi) {
        this.aidi = aidi;
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.weli = weli;
        this.sashualoQula = sashualoQula;
        this.sagnebi = sagnebi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aidi, saxeli, sashualoQula);
    }

    @Override
    public boolean equals(Object object) {
        Student student = (Student) object;

        Set<String> amismSagnebi = new HashSet<>(this.sagnebi);
        Set<String> imisSagnebi = new HashSet<>(student.sagnebi);

        return aidi == student.aidi && Objects.equals(amismSagnebi, imisSagnebi);

    }

    @Override
    public int compareTo(Student sxva) {
        if (this.sashualoQula > sxva.sashualoQula) return 1;
        if (this.sashualoQula < sxva.sashualoQula) return -1;
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: {\n");
        sb.append("id: ").append(aidi).append(",\n");
        sb.append("firstname:").append(saxeli).append(",\n");
        sb.append("lastname:").append(gvari).append(",\n");
        sb.append("year:").append(weli).append(",\n");
        sb.append("avgScore:").append(sashualoQula).append(",\n");
        sb.append("subjects: {\n");
        for (int i = 0; i < sagnebi.size(); i++) {
            sb.append(" ").append(sagnebi.get(i));
            if (i < sagnebi.size() - 1) sb.append(", \n");
        }
        sb.append("\n}\n}");
        return sb.toString();

    }
}


    @Override
    public String toString() {
        return "Student{" + "aidi =" + aidi +
                ", saxeli='" + saxeli + '\'' +
                ", gvari='" + gvari + '\'' +
                ", weli=" + weli +
                ", sashualoQula=" + sashualoQula +
                ", sagnebi=" + sagnebi +
                '}';
    }
}
