package main.java.com.sishodiya.practice.java8.concepts.map;

public class UserEntity {
    private int id;
    private String name;
    private String address;

    UserEntity(int id, String name, String address){
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
