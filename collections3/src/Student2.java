import java.util.ArrayList;
import java.util.Date;

public class Student2 implements Comparable<Student2> {
    private String saxeli;
    private String gvari;
    private Date dabadebisTariRi;
    private ArrayList<Integer> qulebi;

    public Student2(String saxeli, String gvari, Date dabadebisTariRi) {
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.dabadebisTariRi = dabadebisTariRi;
        this.qulebi = new ArrayList<>();
    }

    public String getSaxeli() {
        return saxeli;
    }

    public String getGvari() {
        return gvari;
    }

    public Date getDabadebisTariRi() {
        return dabadebisTariRi;
    }

    public ArrayList<Integer> getQulebi() {
        return qulebi;
    }

    public void daamateQula(int qula) {
        qulebi.add(qula);
    }

    public double getSashualoQula() {
        if (qulebi.isEmpty()) {
            return 0.0;
        }
        int jami = 0;
        for (int qula : qulebi) {
            jami += qula;
        }
        return (double) jami / qulebi.size();
    }

    @Override
    public int compareTo(Student2 o) {
        return this.gvari.compareTo(o.gvari);
    }

    @Override
    public String toString() {
        return "Student{" +
                "saxeli='" + saxeli + " " + gvari + '\'' +
                ", dabadebisTariRi=" + dabadebisTariRi +
                ", sashualoQula=" + String.format("%.2f", getSashualoQula()) +
                '}';
    }
}