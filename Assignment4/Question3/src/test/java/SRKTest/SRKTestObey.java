package SRKTest;

import com.Question3.SRK.Obey.RectangleImpl;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class SRKTestObey {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDimensions() throws Exception {
        RectangleImpl recImp = new RectangleImpl();
        Assert.assertEquals(recImp.getRectangle().getWidth(),7);
        Assert.assertEquals(recImp.getRectangle().getHeight(),5);
    }

    @Test
    public void testArea() throws Exception {
        RectangleImpl recImp = new RectangleImpl();
     Assert.assertEquals(recImp.getRectangle().area(),40);
    }

    @Test
    public void testDisplay() throws Exception {
        RectangleImpl recImp = new RectangleImpl();
        recImp.getRectangle().printRectangle();
    }
}
