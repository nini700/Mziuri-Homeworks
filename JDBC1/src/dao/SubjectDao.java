package dao;

import model.Subject;
import java.util.List;

public interface SubjectDao {
    void create(Subject subject);
    List<Subject> findAll();
    Subject findById(int id);
    void update(Subject subject);
    void delete(int id);
}