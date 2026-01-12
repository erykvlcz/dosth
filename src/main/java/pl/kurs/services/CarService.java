package pl.kurs.services;

import pl.kurs.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();

    public void addCarToCarsList(Car... newCars){
        Arrays.stream(newCars).filter(c -> c != null).forEach(c -> cars.add(c));
    }

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}
