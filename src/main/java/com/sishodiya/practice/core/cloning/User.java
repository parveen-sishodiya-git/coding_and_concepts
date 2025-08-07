package main.java.com.sishodiya.practice.core.cloning;

public class User implements Cloneable{
     private String id;
    
    private String name;

    private Address address;


    public User(String id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public Address getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee name "+name+" Employee age "+id+" Employee pincode "+address.getPincode()+" Employee state "+address.getState();
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return new User(id,name,new Address(address.getPincode(), address.getState()));
    }
}
