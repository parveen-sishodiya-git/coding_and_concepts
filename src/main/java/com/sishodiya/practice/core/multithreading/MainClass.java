package main.java.com.sishodiya.practice.core.multithreading;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("in main method ------------------- start");

        // thread 1
        Thread t1 = new Thread(new TestThread1());
        
        // TestThread1 thread1 = new TestThread1();
        t1.start();
        try {
            // t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // t1.start();

        // thread 2
        System.out.println("abouve thread 2");
        TestThread2 thread2 = new TestThread2();
        thread2.start();
        try {
            thread2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // thread 3
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am thread 3333333333333333333 " + i);
                // try {
                //     Thread.sleep(500);
                // } catch (Exception e) {
                //     // TODO: handle exception
                // }
            }
        });
        t3.start();
        System.out.println("in main method -------------------END");
    }
}
