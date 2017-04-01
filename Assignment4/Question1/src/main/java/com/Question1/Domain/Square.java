package com.Question1.Domain;

/**
 * Created by Kishan on 2017-03-30.
 */
public class Square extends Shape {
    public Square(String shapeName,int numOfSides,String colour)
    {
        super.setShapeName(shapeName);
        super.setnumOfSides(numOfSides);
        super.setColour(colour);
    }
}
