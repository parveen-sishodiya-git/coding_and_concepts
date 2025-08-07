package main.java.com.sishodiya.practice.core.cloning;
public class Address {
    private String state;
    private String pincode;

    public Address(String state, String pincode){
        this.state = state;
        this.pincode = pincode;
    }

     public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter for pincode
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
