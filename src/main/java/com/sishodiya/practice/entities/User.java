package main.java.com.sishodiya.practice.entities;

import java.util.List;

public class User {
    private String name;
    private List<String> phone;

    public User(String name, List<String> phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhone() {
        return phone;
    }
}
