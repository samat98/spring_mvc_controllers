package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    List<Car>  cars = new ArrayList<>();

    public CarService() {
        createCars();
    }

    public void createCars() {
        Car car1 = new Car("mers", 220, 2014);
        Car car2 = new Car("BMW", 11, 2004);
        Car car3 = new Car("Toyota", 20, 2014);
        Car car4 = new Car("Honda", 11, 2015);
        Car car5 = new Car("Hyunday", 130, 2016);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
