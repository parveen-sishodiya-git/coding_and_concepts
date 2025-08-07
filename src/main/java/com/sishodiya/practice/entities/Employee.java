package main.java.com.sishodiya.practice.entities;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department,double salary){
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EmpWithNameAgeDept{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee user = (Employee) obj;
        return user.getName().equals(name) && user.getAge()==(age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
