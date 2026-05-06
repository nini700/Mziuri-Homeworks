import dao.StudentDaoImpl;
import dao.SubjectDaoImpl;
import dao.TeacherDaoImpl;
import model.Student;
import model.Subject;
import model.Teacher;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        SubjectDaoImpl subjectDao = new SubjectDaoImpl();
        subjectDao.create(new Subject(-1, "kompiuteruli mecniereba"));
        subjectDao.create(new Subject(-1, "qimia"));

        subjectDao.findAll().forEach(System.out::println);

        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        teacherDao.create(new Teacher(-1, "madlena", "nadiradze", 1, 2500.0));

        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.create(new Student(-1, "sandra", "kharebava", 10));

        TeacherService teacherService = new TeacherService(teacherDao, subjectDao);
        System.out.println(teacherService.getSubjectNameByTeacherId(1));
    }
}