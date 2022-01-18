package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = List.of(
            new Car("Lada", 1, 1991),
            new Car("BMW", 2, 1992),
            new Car("Audi", 3, 1993),
            new Car("Mercedes", 4, 1994),
            new Car("Ford", 5, 1995)
    );

    public List<Car> getCars(int count){
        if (count <= 0 || count > cars.size()) {
            return cars;
        }
        return new ArrayList<>(cars.subList(0, count));
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
