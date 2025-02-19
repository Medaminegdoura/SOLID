package com.directi.training.srp.exercise;

import java.util.List;

public class CarRepo {
    private static List<Car> _carsDb = CarDB.getInstance();

    public static  Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public static List<Car> getAllCars()
    {
        return _carsDb;
    }
}
