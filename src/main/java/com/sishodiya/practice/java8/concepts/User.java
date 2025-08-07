
package main.java.com.sishodiya.practice.java8.concepts;
import java.util.Optional;

public class User {
    private Optional<String> name = Optional.empty();
    private String gender;

    User(){}
    User(String gender, String name){
        this.name = Optional.ofNullable(name);
        this.gender = gender;
    }

    public Optional<String> getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = Optional.ofNullable(name);
    }
}
