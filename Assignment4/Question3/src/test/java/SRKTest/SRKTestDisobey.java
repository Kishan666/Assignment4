package SRKTest;

import com.Question3.SRK.Disobey.IRectangle;
import com.Question3.SRK.Disobey.RectangleImpl;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class SRKTestDisobey {
    private IRectangle shapeRectangle;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDimensions() throws Exception {
        RectangleImpl recImp = new RectangleImpl();

        //Rectangle rectangle = shapeRectangle.getRectangle();
        Assert.assertEquals(recImp.getRectangle().getHeight(), 5);
        Assert.assertEquals(recImp.getRectangle().getWidth(), 7);
    }

    @Test
    public void testArea() throws Exception {
        RectangleImpl recImp = new RectangleImpl();
        Assert.assertEquals(recImp.getRectangle().area(), 35);


    }
}