package main.java.com.sishodiya.practice.java8.programs;

import main.java.com.sishodiya.practice.entities.Employee;
import main.java.com.sishodiya.practice.entities.EntityFiller;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByDepartment {
    public static void main(String[] args) {
        List<Employee> employee = EntityFiller.getList();

        //average age per department
//        Map<String,Double> map =  employee.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getAge)));
//        map.entrySet().forEach(System.out::println);

        //group by department
//        Map<String,List<Employee>> map =  employee.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//        map.entrySet().forEach(System.out::println);

        //N highest salary
//       Map<String,Double> map =  employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(30)
//               .collect(Collectors.toMap(Employee::getName, Employee::getSalary,(existing,newitem)->existing,LinkedHashMap::new));
//       map.entrySet().forEach(System.out::println);

        //Top N salaries department wise
        Map<String,List<Double>> map =  employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.toList(),list->
                list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).map(Employee::getSalary).collect(Collectors.toList())
                )));

        map.entrySet().forEach(System.out::println);

    }
}
