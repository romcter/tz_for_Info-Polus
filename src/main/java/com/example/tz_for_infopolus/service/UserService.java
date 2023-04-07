package com.example.tz_for_infopolus.service;

import com.example.tz_for_infopolus.entity.Car;
import com.example.tz_for_infopolus.entity.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<String, User> users = new HashMap<>();

    public UserDto getUserByName(String name){
        return userToDto(users.get(name));
    }

    public List<UserDto> getAllUser(){
        return users.values()
                .stream()
                .map(this::userToDto)
                .toList();
    }

    public void initializer(){
        User petrov = new User("Petrov", List.of(new Car("Jigyl")));
        users.put(petrov.getName(), petrov);

        User ivanov = new User("Ivanov", List.of(new Car("Volvo"), new Car("Sitroen")));
        users.put(ivanov.getName(), ivanov);

        User sidorov = new User("Sidorov", List.of(new Car("Honda"), new Car("BWM")));
        users.put(sidorov.getName(), sidorov);
    }

    private UserDto userToDto(User user){
        List<CarDto> carDtos = user.getCars()
                .stream()
                .map(this::carToDto)
                .toList();
        return new UserDto(user.getName(), carDtos);
    }

    private CarDto carToDto(Car car){
        return new CarDto(car.getName());
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public class UserDto {
        private String name;

        private List<CarDto> cars;

        public UserDto(String name, List<CarDto> cars) {
            this.name = name;
            this.cars = cars;
        }

        @Override
        public String toString() {
            return "UserDto{" +
                    "name='" + name + '\'' +
                    ", cars=" + cars +
                    '}';
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public class CarDto{
        private String name;

        public CarDto(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "CarDto{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
