package com.Question3.DIP.Obey.Domain;

import com.Question3.DIP.Obey.Service.InterfaceCar;

/**
 * Created by Kishan on 2017-03-31.
 */
public class Manufacture {
    InterfaceCar vehicle;

    public void createCar(InterfaceCar vehicle){
        this.vehicle = vehicle;
    }

    public void display(){
        vehicle.displayCar();
    }
}
