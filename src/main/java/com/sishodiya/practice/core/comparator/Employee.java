package main.java.com.sishodiya.practice.core.comparator;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Employee name "+name+" Employee age "+age;
    }

    @Override
    public int compareTo(Employee e) {
        // TODO Auto-generated method stub
        return this.age - e.getAge();
    }

}
