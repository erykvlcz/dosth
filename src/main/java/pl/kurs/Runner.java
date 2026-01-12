package pl.kurs;

import pl.kurs.models.Car;
import pl.kurs.services.CarService;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        Car c1 = new Car("Honda Civic 2.0");

        Optional<Car> carOptional = Optional.of(c1);
        Car car = carOptional.orElse(new Car("Citoren Saxo"));
        System.out.println(car);

        CarService carService = new CarService();

    }
}
