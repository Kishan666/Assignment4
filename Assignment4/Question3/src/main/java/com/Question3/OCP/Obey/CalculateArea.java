package com.Question3.OCP.Obey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class CalculateArea {
    private  double area;

    public double getArea(Shape shape){

        area = shape.Area();
        return Math.round(area * 100.0) / 100.0;
    }
}
