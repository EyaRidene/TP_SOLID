package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private CarDataHandler _carDataHandler = new CarDataHandler();

    public Car getFromDb(final String carId) {
        return _carDataHandler.getCarById(carId);
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carDataHandler.getAllCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        return _carDataHandler.getBestCar();
    }
}