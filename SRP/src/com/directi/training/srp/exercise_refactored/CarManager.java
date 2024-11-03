package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private CarRepository carRepository = new CarRepository();
    private CarFormatter carFormatter = new CarFormatter();
    private CarRater carRater = new CarRater();

    public Car findCarById(String carId) {
        return carRepository.getCarById(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carRepository.getAllCars();
        return carFormatter.formatCarNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carRater.getBestCar(cars);
    }
}
