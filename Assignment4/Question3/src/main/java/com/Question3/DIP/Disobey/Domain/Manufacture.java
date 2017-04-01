package com.Question3.DIP.Disobey.Domain;



/**
 * Created by Kishan on 2017-03-31.
 */
public class Manufacture {
    Car car;

    public void createCar(Car car){
        this.car=car;
    }

    public void displayDetails(){
        System.out.println(car.toString());
    }
}
