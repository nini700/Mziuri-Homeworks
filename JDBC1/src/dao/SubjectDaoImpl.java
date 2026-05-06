package dao;

import db.DatabaseConnectionManager;
import model.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    private final DatabaseConnectionManager dcm = new DatabaseConnectionManager();

    private final String INSERT = "INSERT INTO subjects (subject_name) VALUES (?);";
    private final String FIND_ALL = "SELECT * FROM subjects";
    private final String FIND_BY_ID = "SELECT * FROM subjects WHERE id = ?";
    private final String UPDATE = "UPDATE subjects SET subject_name = ? WHERE id = ?";
    private final String DELETE = "DELETE FROM subjects WHERE id = ?";

    @Override
    public void create(Subject subject) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, subject.getSubjectName());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<Subject> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();
            List<Subject> subjects = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String subjectName = rs.getString("subject_name");
                Subject subject = new Subject(id, subjectName);
                subjects.add(subject);
            }
            return subjects;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public Subject findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Subject subject = null;
            if (rs.next()) {
                subject = new Subject(
                        id,
                        rs.getString("subject_name")
                );
            }
            return subject;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void update(Subject subject) {
        try (PreparedStatement stmt = dcm
                .getConnection()
                .prepareStatement(UPDATE)
        ) {
            stmt.setString(1, subject.getSubjectName());
            stmt.setInt(2, subject.getId());
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