package com.Question3.DIP.Obey.Service;

/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question3.DIP.Obey.Service.InterfaceCar;
import com.Question3.DIP.Obey.Domain.Car;

public class ToyotaImp implements InterfaceCar {
    public void displayCar() {
        Car toyota = new Car("Supra","8556-214",320);
        System.out.println(toyota.toString());
    }
    public Car getCarInfo() {
        Car toyota = new Car("Supra","8556-214",320);
        return toyota;
    }
}
