CREATE DATABASE IF NOT EXISTS todo;
USE todo;
CREATE TABLE IF NOT EXISTS projects (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255),
    createdOn DATETIME NOT NULL,
    lastUpdate DATETIME NOT NULL, 
    PRIMARY KEY (id)
    );
CREATE TABLE IF NOT EXISTS tasks (
    id INT NOT NULL AUTO_INCREMENT,
    idProject INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255),
    isComplete BOOLEAN NOT NULL,  
    notes VARCHAR(255),
    dueDate DATE,
    createdOn DATETIME NOT NULL,
    lastUpdate DATETIME NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (idProject) 
    	REFERENCES projects(id)
        ON DELETE CASCADE
    );