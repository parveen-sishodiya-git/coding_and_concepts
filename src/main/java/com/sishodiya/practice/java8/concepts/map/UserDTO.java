package main.java.com.sishodiya.practice.java8.concepts.map;

public class UserDTO {
    private String name;
    private String address;

    UserDTO(String name,String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
