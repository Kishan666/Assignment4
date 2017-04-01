package com.Question3.OCP.Obey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.round((radius*radius*Math.PI)*100)/100;
    }
}
