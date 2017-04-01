package com.Question1;

import com.Question1.Implementation.CircleImplementation;
import com.Question1.Implementation.SquareImplementation;



/**
 * Created by Kishan on 2017-03-29.
 */
public class App{
    public static void main(String[] args)
    {
        CircleImplementation circ = new CircleImplementation();

        SquareImplementation square = new SquareImplementation();

        System.out.println(square.getShape());
        System.out.println(circ.getShape());
    }
}
