package com.Question3.SRK.Disobey;

import com.Question3.SRK.Disobey.Rectangle;
import com.Question3.SRK.Disobey.RectangleImpl;

/**
 * SRP has been violated
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rectangle rectangle = new RectangleImpl().getRectangle();
        rectangle.printRectangle();
    }
}
