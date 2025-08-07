package main.java.com.sishodiya.practice.entities;

import java.util.Objects;

public class UserWithNameAndAge {
    private String name;
    private String age;

    public UserWithNameAndAge(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserWithNameAndAge{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof UserWithNameAndAge)) return false;
        UserWithNameAndAge user = (UserWithNameAndAge) obj;
        return user.getName().equals(name) && user.getAge().equals(age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
