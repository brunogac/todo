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
public class Project {
    private int id;
    private String name;
    private String description;
    private Date createdOn;
    private Date lastUpdate;

    public Project(int id, String name, String description, Date createdOn, Date lastUpdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
        this.lastUpdate = lastUpdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "project{" + "id=" + id + ", name=" + name + ", description=" + description + ", createdOn=" + createdOn + ", lastUpdate=" + lastUpdate + '}';
    }
    
}
