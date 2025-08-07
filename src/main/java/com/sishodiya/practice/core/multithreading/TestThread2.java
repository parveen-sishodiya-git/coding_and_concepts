package main.java.com.sishodiya.practice.core.multithreading;
public class TestThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("I am thread 222222222222222 "+i);
            try {
                Thread.sleep(900);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
