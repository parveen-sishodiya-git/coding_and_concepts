package main.java.com.sishodiya.practice.core.cloning;
public class cloning {
    public static void main(String[] args) {
        User user = new User("1","Praveen",new Address("UP", "201009"));
        System.out.println("original object "+user);
        try {
            User user2 = user.clone();
            user.setName("adi");
            user.getAddress().setPincode("151515");
            user.getAddress().setState("UK");
            System.out.println("cloned obj "+user);
            System.out.println("u cloned obj "+user2);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
