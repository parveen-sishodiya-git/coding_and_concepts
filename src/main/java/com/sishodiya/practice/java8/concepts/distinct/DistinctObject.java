package main.java.com.sishodiya.practice.java8.concepts.distinct;

import main.java.com.sishodiya.practice.entities.UserWithNameAndAge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctObject {
    public static void main(String[] args) {
        List<UserWithNameAndAge> list = Stream.of(
                new UserWithNameAndAge("Praveen","27"),
                new UserWithNameAndAge("Ankita","26"),
                new UserWithNameAndAge("Praveen","27")
        ).distinct().collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
