package controller;

import model.Project;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author bruno
 */

public class ProjectController {
    public void save(Project project) {
        String sql = "INSERT INTO projects ("
                + "name, "
                + "description, "
                + "createdOn, "
                + "lastUpdate)"
                + "VALUES (?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedOn().getTime()));
            statement.setDate(4, new Date(project.getLastUpdate().getTime()));
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o projeto " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void update(Project project) {
        String sql = "UPDATE projects SET "
                + "name = ?, "
                + "description = ?, "
                + "lastUpdate = ? "
                + "WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getLastUpdate().getTime()));
            statement.setInt(4, project.getId());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar o projeto" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void removeById(int projectId) {
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, projectId);
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar o projeto" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM projects";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet res = null;
        List<Project> projects = new ArrayList<Project>();
        
        try{
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            res = statement.executeQuery();
            while(res.next()){
                Project project = new Project(
                res.getInt("id"),
                res.getString("name"),
                res.getString("description"),
                new java.util.Date(res.getDate("CreatedOn").getTime()),
                new java.util.Date(res.getDate("lastUpdate").getTime()));
            projects.add(project);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar o projeto" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement, res);
        }
        return projects;
    }
}
