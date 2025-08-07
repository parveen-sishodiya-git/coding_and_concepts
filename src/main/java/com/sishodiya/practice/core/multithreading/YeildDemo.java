package main.java.com.sishodiya.practice.core.multithreading;
public class YeildDemo {
    public static void main(String[] args) {
        Runnable run = ()->{
          for (int i = 0; i < 10; i++) {
                System.out.println("i am thread 11111 "+ Thread.currentThread().getName());
                Thread.yield();
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    e.printStackTrace();
                    // TODO: handle exception
                }
            }  
        };
        
        Thread th1 = new Thread(run,"Thread 1");
        
        Runnable run2 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("i am thread 22222222222 "+ Thread.currentThread().getName());  
                System.out.println("Thread 1 is "+th1.isAlive());
                // Thread.yield();
                th1.interrupt();
            }
        };
        
        Thread th2 = new Thread(run2, "Thread 2");
        th1.start();
        th2.start();
    }
}

