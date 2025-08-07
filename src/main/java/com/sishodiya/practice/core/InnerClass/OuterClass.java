package main.java.com.sishodiya.practice.core.InnerClass;// package table_no_1.InnerClass;

public class OuterClass {
    private String outerstr = "outer class string";

    static class InnerClass {
        private String innerstr = "Inner static class string";
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = new OuterClass.InnerClass();
        System.out.println(outer.outerstr);
        
    }

    //non static inner class
    // public class InnerClass {
    //     private String innerstr = "Inner class string";
    // }

    
    // public static void main(String[] args) {
    //     OuterClass outer = new OuterClass();
    //     OuterClass.InnerClass inner = outer.new InnerClass();
    //     System.out.println(outer.outerstr);
    //     System.out.println(inner.innerstr);

    // }
}
