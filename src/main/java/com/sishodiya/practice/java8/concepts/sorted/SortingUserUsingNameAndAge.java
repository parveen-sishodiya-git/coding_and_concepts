package main.java.com.sishodiya.practice.java8.concepts.sorted;

import main.java.com.sishodiya.practice.entities.UserWithNameAndAge;
import main.java.com.sishodiya.practice.entities.UserWithNameAndAgeComparator;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortingUserUsingNameAndAge {
    public static void main(String[] args) {
        SortingUserUsingNameAndAge obj = new SortingUserUsingNameAndAge();
        obj.sortUser();
    }

    public void sortUser(){
        Stream.of(
                new UserWithNameAndAge("Praveen","28"),
                new UserWithNameAndAge("Om","29")
        ).sorted(Comparator.comparing(UserWithNameAndAge::getName)).forEach(System.out::println);
    }
}
