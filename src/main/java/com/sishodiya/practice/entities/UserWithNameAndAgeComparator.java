package main.java.com.sishodiya.practice.entities;

import java.util.Comparator;

public class UserWithNameAndAgeComparator implements Comparator<UserWithNameAndAge> {

    @Override
    public int compare(UserWithNameAndAge o1, UserWithNameAndAge o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
