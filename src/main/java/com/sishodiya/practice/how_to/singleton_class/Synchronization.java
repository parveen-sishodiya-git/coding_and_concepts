package main.java.com.sishodiya.practice.how_to.singleton_class;

public class Synchronization {
    
    static int counter = 0;
    

    public static synchronized void incrementCounter(){
        counter++;
    }

    public static void main(String[] args) {
        

        Runnable rt1 = ()->{
            for (int i = 0; i < 100000; i++) {
                // counter +=1;
                incrementCounter();
            }
        };

        Runnable rt2 = ()->{
            for (int i = 0; i < 100000; i++) {
                // counter +=1;
                incrementCounter();
                try {
                    // Thread.sleep(500);
                    
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };

        Thread t1 = new Thread(rt1);
        Thread t2 = new Thread(rt2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Count is "+counter);
    }   
}
