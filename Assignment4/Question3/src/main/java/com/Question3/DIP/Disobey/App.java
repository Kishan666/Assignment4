package com.Question3.DIP.Disobey;

import com.Question3.DIP.Disobey.Domain.Car;
import com.Question3.DIP.Disobey.Domain.Manufacture;


/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main(String[] args) {
        Car car = new Car("Honda", "5568-5426", 120);
        Manufacture manufacture = new Manufacture();
        manufacture.createCar(car);
        manufacture.displayDetails();
    }
}
