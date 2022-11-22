/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
/**
 *
 * @author bruno
 */
public class Task {
    private int id;
    private int idProject;
    private String name;
    private String description;
    private boolean isComplete;
    private String notes;
    private Date dueDate;
    private Date CreatedOn;
    private Date lastUpdate;

    public Task(int id, int idProject, String name, String description, boolean isComplete, String notes, Date dueDate, Date CreatedOn, Date lastUpdate) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.isComplete = isComplete;
        this.notes = notes;
        this.dueDate = dueDate;
        this.CreatedOn = CreatedOn;
        this.lastUpdate = lastUpdate;
    }
    public Task(int idProject, String name, String description, boolean isComplete, String notes, Date dueDate) {
        this.id = 1;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.isComplete = isComplete;
        this.notes = notes;
        this.dueDate = dueDate;
        this.CreatedOn = new Date();
        this.lastUpdate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", isComplete=" + isComplete + ", notes=" + notes + ", dueDate=" + dueDate + ", CreatedOn=" + CreatedOn + ", lastUpdate=" + lastUpdate + '}';
    }
}
