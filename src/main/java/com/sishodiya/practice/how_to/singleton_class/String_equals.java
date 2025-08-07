package main.java.com.sishodiya.practice.how_to.singleton_class;// package



class String_equals implements AutoCloseable{
    public static void main(String[] args) {
        String_equals obj = new String_equals();
        // obj.stringHash();
        // obj.methodOverloading();
        // obj.finilazeMethod();
    }   

    public void finilazeMethod(){
        String s  = new String("fd");
        s =null;
        // System.gc();
    }


    public void methodOverloading(){
        String st = testMethod();
        int tet = testMethod("hi");
    }

    public String testMethod(){
        return "i am string";
    }
    public int testMethod(String st){
        return 2;
    }

    public void stringHash(){
        String s1 = "Praveen";
        String s2 = "Praveen";
        String s3 = new String("Praveen1111111");
        String s4 = new String("Praveen1111111");
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s4 == s3);
    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    // @Override
    // public int hashCode() {
    //     return Objects.hash("Praveen");  // returns a consistent hash code
    // }
}