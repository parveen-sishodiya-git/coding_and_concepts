package main.java.com.sishodiya.practice.core.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorMainClass {
    public static void main(String[] args) {
        Comparatorr comparatorr = new Comparatorr();
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Aditya", 32));
        list.add(new Employee("Praveen", 28));
        list.add(new Employee("Ashish", 30));

        for(Employee e:list){
            System.out.println(e.toString());
        }
        Collections.sort(list);
        // Collections.sort(list,comparatorr);
        System.out.println("after sorting");
        for(Employee e:list){
            System.out.println(e.toString());
        }

        MainClass();
    }

    public static void MainClass(){
        System.out.println("test");
    }
}
