package main.java.com.sishodiya.practice.java8.concepts.flattenmap;


import main.java.com.sishodiya.practice.entities.User;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfUsersWithListOfPhoneNumbers {
    public static void main(String[] args) {
//        List<String> phoneNumbers = Stream.of(
//                new User("Praveen",new ArrayList<>(Arrays.asList("8800","387601"))),
//                new User("Rakesh",new ArrayList<>(Arrays.asList("9599","672062")))
//        ).flatMap(user -> user.getPhone().stream()
//                        .map(number -> user.getName() + number))
//                .collect(Collectors.toList());
//
//        phoneNumbers.forEach(System.out::println);

        List<String> phoneNumbers2 = Stream.of(
                new User("Praveen",new ArrayList<>(Arrays.asList("8800","387601"))),
                new User("Rakesh",new ArrayList<>(Arrays.asList("9599","672062")))
        ).flatMap(user->user.getPhone().stream().map(s->user.getName()+"_"+s)).collect(Collectors.toList());
        phoneNumbers2.forEach(System.out::println);


    }
}
