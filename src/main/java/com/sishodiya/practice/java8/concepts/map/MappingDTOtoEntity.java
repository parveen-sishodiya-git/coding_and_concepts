package main.java.com.sishodiya.practice.java8.concepts.map;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingDTOtoEntity {
    public static void main(String[] args) {
        List<UserEntity> userEntityList = Stream.of(
            new UserDTO("Praveen","Lalkuan"),
            new UserDTO("Amit","Delhi"),
            new UserDTO("Vikas","Trilokpuri")
        ).map(MappingDTOtoEntity::getUserEntity).collect(Collectors.toList());

        //.collect(Collectors.toList()); -> returns modifialble list where java 8
        //.toList() -> returns immutable list java 16

        userEntityList.forEach(System.out::println);
    }

    public static UserEntity getUserEntity(UserDTO dto){
        return  new UserEntity(new Random().nextInt(100), dto.getName(), dto.getAddress());
    }
}
