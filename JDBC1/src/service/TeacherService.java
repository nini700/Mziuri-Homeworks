package service;

import dao.SubjectDao;
import dao.TeacherDao;
import model.Teacher;
import model.Subject;

public class TeacherService {
    private final TeacherDao teacherDao;
    private final SubjectDao subjectDao;

    public TeacherService(TeacherDao teacherDao, SubjectDao subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }

    public String getSubjectNameByTeacherId(int teacherId) {
        Teacher teacher = teacherDao.findById(teacherId);
        Subject subject = subjectDao.findById(teacher.getSubject());
        return subject.getSubjectName();
    }
}