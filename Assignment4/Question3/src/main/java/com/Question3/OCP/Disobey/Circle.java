package com.Question3.OCP.Disobey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class Circle {

   private double radius;

public Circle(){}
    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    /*@Override
    public double getArea(Object o) {
        return radius*radius*Math.PI;
    }*/
}
