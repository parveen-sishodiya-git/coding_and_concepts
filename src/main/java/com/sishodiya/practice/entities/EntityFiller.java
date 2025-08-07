package main.java.com.sishodiya.practice.entities;

import java.util.ArrayList;
import java.util.List;

public class EntityFiller {
    public static List<Employee> getList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Praveen",28,"Onboarding",140000));
        list.add(new Employee("Amit",32,"Connectivity",110000));
        list.add(new Employee("Om",29,"Onboarding",125000));
        list.add(new Employee("Vikas",28,"Connectivity",122000));
        list.add(new Employee("Akshita",30,"Ticketing",140000));
        list.add(new Employee("Shivam",29,"Checkin",90000));
        list.add(new Employee("Akash",27,"Checkin",142000));
        list.add(new Employee("Lokesh",39,"Onboarding",137000));
        return list;
    }
}
