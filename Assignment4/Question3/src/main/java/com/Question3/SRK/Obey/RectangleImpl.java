package com.Question3.SRK.Obey;

import com.Question3.SRK.Obey.Rectangle;
import com.Question3.SRK.Obey.IRectangle;

/**
 * Created by Kishan on 2017-03-31.
 */
public class RectangleImpl implements IRectangle {
    public Rectangle getRectangle() {
        return new Rectangle(7,5);
    }
}
