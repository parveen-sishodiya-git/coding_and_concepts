package main.java.com.sishodiya.practice.java8.concepts.map;

import java.util.Arrays;
import java.util.stream.Stream;

class Person{
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class RetreivePropertyFromObject {
    public static void main(String[] args) {
        String address = Stream.of(
                new Person("Parveen","Lalkuan"),
                new Person("Amit","Delhi"),
                new Person("Vikas","Shimla"),
                new Person("Vikas","Lrilokpuri")
        ).filter(person->person.getName().equalsIgnoreCase("Ravikant"))
                .map(Person::getAddress).findFirst().orElse("Not Found");

        System.out.println(address);
    }
}
