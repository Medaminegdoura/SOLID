package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{

    public static CarRepo _carRepo ;



    public String getCarsNames()
    {
        List<Car> _cars = CarRepo.getAllCars();

        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        List<Car> _cars = CarRepo.getAllCars();

        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
