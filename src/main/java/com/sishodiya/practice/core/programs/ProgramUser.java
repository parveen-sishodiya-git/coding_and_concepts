package main.java.com.sishodiya.practice.core.programs;

public class ProgramUser {
    private int age;
    private String name;

    public ProgramUser(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name = "+name+" Age = "+age;
    }

}
