package main.java.com.sishodiya.practice.java8.programs;

//{
//        "totalCount": 10,
//        "avgAge": 30.5,
//        "names": [Alice, Bob, Charlie, ...]
//}

import main.java.com.sishodiya.practice.entities.UserWithNameAndAge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSummaryReport {
    public static void main(String[] args) {

        Map<String,Object> summary = new HashMap<>();

        List<UserWithNameAndAge> mainList = Arrays.asList(
                new UserWithNameAndAge("Praveen","28"),
                new UserWithNameAndAge("Amit","32"),
                new UserWithNameAndAge("Vikas","20")
        );

        List<String> names = mainList.stream().map(UserWithNameAndAge::getName).collect(Collectors.toList());
        double ageAvg = mainList.stream().map(o->Integer.valueOf(o.getAge()))
                .collect(Collectors.averagingInt(n->n));

        long count = mainList.stream().collect(Collectors.counting());
        summary.put("totalcount",count);
        summary.put("avg age",ageAvg);
        summary.put("names",names);

        System.out.println(summary);

    }
}
