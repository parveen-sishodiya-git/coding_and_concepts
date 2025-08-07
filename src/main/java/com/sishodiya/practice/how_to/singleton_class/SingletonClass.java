package main.java.com.sishodiya.practice.how_to.singleton_class;

public class SingletonClass {
    private String employeeName ="praveen sishodiya";
    private static SingletonClass singletonClassObject = null;
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if (singletonClassObject == null) {
            System.out.println("Created Singleton Object");
            singletonClassObject = new SingletonClass();
        }else{
            System.out.println("Returning existing singleton object");
        }
        return singletonClassObject;
    }

}
