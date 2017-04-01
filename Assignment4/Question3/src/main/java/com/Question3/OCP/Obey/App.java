package com.Question3.OCP.Obey;



/**
 * Created by Kishan on 2017-03-31.
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape rec = new Rectangle(7.0,5.0);
        Shape circle = new Circle(5.0);
        CalculateArea calArea = new CalculateArea();
        System.out.println("Circle Area: "+calArea.getArea(circle));
        System.out.println("Rectangle Area: "+calArea.getArea(rec));
    }
}
