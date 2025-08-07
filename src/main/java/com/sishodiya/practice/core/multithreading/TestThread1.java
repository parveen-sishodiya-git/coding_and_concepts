package main.java.com.sishodiya.practice.core.multithreading;
public class TestThread1 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println("I am thread 111111111111111111 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

// thread implemented by extending thread class
// public class TestThread1 extends Thread{
// @Override
// public void run() {
// for(int i = 0; i < 10; i++) {
// System.out.println("I am thread 111111111111111111");
// }
// }
// }
