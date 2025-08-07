
package main.java.com.sishodiya.practice.how_to;


//@Component
public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

}
