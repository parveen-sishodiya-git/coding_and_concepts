package main.java.com.sishodiya.practice.core.comparator;

import java.util.Comparator;

public class Comparatorr implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        // return o1.getAge() - o2.getAge();
        // return o1.getName().compareTo(o2.getName());
        return o2.getName().compareTo(o1.getName());
    }
    
}
