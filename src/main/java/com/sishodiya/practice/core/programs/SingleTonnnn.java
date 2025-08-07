package main.java.com.sishodiya.practice.core.programs;

public class SingleTonnnn {
    private String field1;
    private String field2;
    private String field3;

    private SingleTonnnn instance;

    SingleTonnnn(String field1,String field2,String field3){

    }

    public SingleTonnnn getInstance(){
        if (instance == null) {
            instance = new SingleTonnnn("a","b","c");
        }
        return instance;
    }
}
