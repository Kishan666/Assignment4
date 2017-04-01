package com.Question3.OCP.Disobey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class Rectangle  {
    private double width;
    private double height;



    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


public void setWidth(double width)
{
    this.width=width;
}

    public void setHeight(double height) {
        this.height = height;
    }
/*@Override
    public double getArea(Object o) {
        return width*height;
    }
    */
}
