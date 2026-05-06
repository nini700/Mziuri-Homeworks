package dao;

import db.DatabaseConnectionManager;
import model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    private final DatabaseConnectionManager dcm = new DatabaseConnectionManager();

    private final String INSERT = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?);";
    private final String FIND_ALL = "SELECT * FROM teachers";
    private final String FIND_BY_ID = "SELECT * FROM teachers WHERE id = ?";
    private final String UPDATE = "UPDATE teachers SET first_name = ?, last_name = ?, subject = ?, salary = ? WHERE id = ?";
    private final String DELETE = "DELETE FROM teachers WHERE id = ?";

    @Override
    public void create(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubject());
            ps.setDouble(4, teacher.getSalary());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<Teacher> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();
            List<Teacher> teachers = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int subject = rs.getInt("subject");
                double salary = rs.getDouble("salary");
                Teacher teacher = new Teacher(id, firstName, lastName, subject, salary);
                teachers.add(teacher);
            }
            return teachers;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public Teacher findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Teacher teacher = null;
            if (rs.next()) {
                teacher = new Teacher(
                        id,
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                );
            }
            return teacher;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void update(Teacher teacher) {
        try (PreparedStatement stmt = dcm
                .getConnection()
                .prepareStatement(UPDATE)
        ) {
            stmt.setString(1, teacher.getFirstName());
            stmt.setString(2, teacher.getLastName());
            stmt.setInt(3, teacher.getSubject());
            stmt.setDouble(4, teacher.getSalary());
            stmt.setInt(5, teacher.getId());
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