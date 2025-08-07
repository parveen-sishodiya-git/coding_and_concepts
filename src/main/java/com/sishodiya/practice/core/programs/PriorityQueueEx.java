package main.java.com.sishodiya.practice.core.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {


    public static void main(String[] args) {
//        PriorityQueue<User> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.getAge()));
//        q.add(new User("35", "Aditya"));
//        q.add(new User("28", "Praveen"));
//        q.add(new User("32", "Ashish"));
//        q.add(new User("34", "Ram"));

        // System.out.println(q);
//         while (!q.isEmpty()) {
//            System.out.println(q.poll());  // Output: Bob (25), Alice (30), Charlie (35)
//        }

    }

    public static void main2(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.add(10);
        q.add(20);
        q.add(10);
        q.add(1);
        q.add(0);

        // q.poll();
        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.println("Polled: " + q.poll()); // Output in sorted order: 5, 15, 20
        }
        System.out.println(q);
    }
}
