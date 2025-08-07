package main.java.com.sishodiya.practice.how_to.thread_safe_singleton_class;

public class EagerInitialization {
    private static final EagerInitialization object = new EagerInitialization();

    public EagerInitialization getInstance(){
        return object;
    }
}
