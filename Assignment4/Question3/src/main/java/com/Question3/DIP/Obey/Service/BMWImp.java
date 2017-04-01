package com.Question3.DIP.Obey.Service;

import com.Question3.DIP.Obey.Domain.Car;
import com.Question3.DIP.Obey.Service.InterfaceCar;

/**
 * Created by Kishan on 2017-03-31.
 */
public class BMWImp implements InterfaceCar {
    public void displayCar() {
        Car bmw = new Car("M3","8556-514",300);
        System.out.println(bmw.toString());
    }
    public Car getCarInfo() {
        Car bmw = new Car("M3","8556-514",300);
        return bmw;
    }
}
