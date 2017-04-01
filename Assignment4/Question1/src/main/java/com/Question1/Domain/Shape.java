package com.Question1.Domain;

/**
 * Created by Kishan on 2017-03-30.
 */
import java.io.Serializable;

/**
 * Created by Kishan on 2017-03-29.
 */
abstract public class Shape implements Serializable {
    private String  shapeName;
    private int numOfSides;
    private String colour;

    public String getShapeName(){return shapeName;}
    public void setShapeName(String shapeName){this.shapeName = shapeName;}

    public int getnumOfSides(){return numOfSides;}
    public void setnumOfSides(int numOfSides){this.numOfSides = numOfSides;}

    public String getColour(){return colour;}
    public void setColour(String colour){this.colour = colour;}

    @Override
    public String toString() {
        return "Shape: "+ getShapeName()+"  Number of sides: "+ getnumOfSides()+"  Colour: "+getColour();
    }


}

