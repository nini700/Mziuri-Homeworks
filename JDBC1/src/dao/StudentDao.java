package dao;

import model.Student;
import java.util.List;

public interface StudentDao {
    void create(Student student);
    List<Student> findAll();
    Student findById(int id);
    void update(Student student);
    void delete(int id);
}