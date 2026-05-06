package dao;

import model.Teacher;
import java.util.List;

public interface TeacherDao {
    void create(Teacher teacher);
    List<Teacher> findAll();
    Teacher findById(int id);
    void update(Teacher teacher);
    void delete(int id);
}