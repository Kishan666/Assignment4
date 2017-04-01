package com.Question3.DIP.Obey;

import com.Question3.DIP.Obey.Domain.Manufacture;
import com.Question3.DIP.Obey.Service.BMWImp;
import com.Question3.DIP.Obey.Service.ToyotaImp;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main( String[] args )
    {
        Manufacture manufacture = new Manufacture();


        manufacture.createCar(new ToyotaImp());
        manufacture.display();
        manufacture.createCar(new BMWImp());
        manufacture.display();
    }
}
