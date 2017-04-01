package com.Question1.Implementation;

import com.Question1.Domain.Shape;
        import com.Question1.Interface.ShapeInterface;
        import com.Question1.Domain.Circle;
/**
 * Created by Kishan on 2017-03-29.
 */

public class CircleImplementation extends Shape implements ShapeInterface {
    public Shape getShape()
    {
        Shape circle = new Circle("Circle",0,"Blue");
        circle.toString();


        return circle;








    }
}
