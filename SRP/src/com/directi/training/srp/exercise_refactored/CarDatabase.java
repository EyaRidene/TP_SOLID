package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarDatabase {
    private static final List<Car> _carsDb = Arrays.asList(
        new Car("1", "Golf III", "Volkswagen"),
        new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault")
    );

    public static Car getCarById(String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public static List<Car> getAllCars() {
        return _carsDb;
    }

    public static Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
