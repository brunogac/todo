/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author bruno
 */
public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO tasks ("
                + "idProject, "
                + "name, "
                + "description,"
                + " complete, "
                + "notes, "
                + "dueDate, "
                + "createdOn, "
                + "lastUpdate) VALUES (?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.getIsComplete());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDueDate().getTime()));
            statement.setDate(7, new Date(task.getCreatedOn().getTime()));
            statement.setDate(8, new Date(task.getLastUpdate().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void update(Task task) {
        String sql = "UPDATE tasks SET"
                + " idProject = ?,"
                + " name = ?,"
                + " description = ?,"
                + " complete = ?,"
                + " notes = ?,"
                + " dueDate = ?,"
                + " createdOn = ?,"
                + " lastUpdate = ?"
                + " WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.getIsComplete());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDueDate().getTime()));
            statement.setDate(7, new Date(task.getCreatedOn().getTime()));
            statement.setDate(8, new Date(task.getLastUpdate().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);

        }
    }

    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet res = null;

        List<Task> tasks = new ArrayList<Task>();
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, idProject);
            res = statement.executeQuery();
            while (res.next()) {
                Task task = new Task(res.getInt("id"),
                        res.getInt("idProject"),
                        res.getString("name"),
                        res.getString("description"),
                        res.getBoolean("complete"),
                        res.getString("notes"),
                        new java.util.Date(res.getDate("dueDate").getTime()),
                        new java.util.Date(res.getDate("CreatedOn").getTime()),
                        new java.util.Date(res.getDate("lastUpdate").getTime()));
                tasks.add(task);

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement, res);
        }
        return tasks;
    }
}
