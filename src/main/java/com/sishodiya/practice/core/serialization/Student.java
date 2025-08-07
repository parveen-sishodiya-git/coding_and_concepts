package main.java.com.sishodiya.practice.core.serialization;

import java.beans.Transient;
import java.io.Serializable;

public class Student implements Serializable{
    
    private String id;

    
    transient private String name;

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
