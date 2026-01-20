package savarjisho1;

public class Main {
    public static void main(String[] args) {
        University university = new University("თბილისის სახელმწიფო უნივერსიტეტი", true, 12);
        university.printInfo();

        University.Student student = university.new Student(
                "nini",
                "badridze",
                16,
                "0974134567",
                95.5,
                3
        );
        student.printInfo();
    }
}