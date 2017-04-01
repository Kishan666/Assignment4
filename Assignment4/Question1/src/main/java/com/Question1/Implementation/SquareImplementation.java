package com.Question1.Implementation;

import com.Question1.Domain.Shape;
        import com.Question1.Domain.Square;
        import com.Question1.Interface.ShapeInterface;

/**
 * Created by Kishan on 2017-03-29.
 */
public class SquareImplementation extends Shape implements ShapeInterface {
    public Shape getShape()
    {
        Shape square = new Square("square",4,"Red");
        square.toString();
        return square;
    }
}
