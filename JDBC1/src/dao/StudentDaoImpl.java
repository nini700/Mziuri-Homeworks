package dao;

import db.DatabaseConnectionManager;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final DatabaseConnectionManager dcm = new DatabaseConnectionManager();

    private final String INSERT = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?);";
    private final String FIND_ALL = "SELECT * FROM students";
    private final String FIND_BY_ID = "SELECT * FROM students WHERE id = ?";
    private final String UPDATE = "UPDATE students SET first_name = ?, last_name = ?, grade = ? WHERE id = ?";
    private final String DELETE = "DELETE FROM students WHERE id = ?";

    @Override
    public void create(Student student) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<Student> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int grade = rs.getInt("grade");
                Student student = new Student(id, firstName, lastName, grade);
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public Student findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Student student = null;
            if (rs.next()) {
                student = new Student(
                        id,
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("grade")
                );
            }
            return student;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void update(Student student) {
        try (PreparedStatement stmt = dcm
                .getConnection()
                .prepareStatement(UPDATE)
        ) {
            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getGrade());
            stmt.setInt(4, student.getId());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement stmt = dcm
                .getConnection()
                .prepareStatement(DELETE)
        ) {
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}