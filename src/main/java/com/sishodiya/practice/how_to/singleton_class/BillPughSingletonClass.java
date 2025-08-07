package main.java.com.sishodiya.practice.how_to.singleton_class;

// package table_no_1;
public class BillPughSingletonClass {
    
    private BillPughSingletonClass(){}

    
    static class InnerBillPughSingletonClass {
        private static final BillPughSingletonClass INSTANCE = new BillPughSingletonClass();
    }

    public static BillPughSingletonClass getInstance(){
        return InnerBillPughSingletonClass.INSTANCE;
    }

}
