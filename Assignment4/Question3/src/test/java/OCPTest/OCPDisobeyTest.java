package OCPTest;

import com.Question3.OCP.Disobey.CalculateArea;
import com.Question3.OCP.Disobey.Circle;
import com.Question3.OCP.Disobey.Rectangle;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Kishan on 2017-03-31.
 */
public class OCPDisobeyTest {



    @Before
    public void setUp() throws Exception
    {


    }
    @Test
    public void testRectangle() throws Exception {
        Rectangle rec = new Rectangle(7.0,5.0);
        Assert.assertEquals(rec.getHeight(),5.0);
        Assert.assertEquals(rec.getWidth(),7.0);
    }

   @Test
    public void testCircle() throws Exception {
        Circle circle = new Circle(5.0);
        Assert.assertEquals(circle.getRadius(),5.0);
   }

    @Test
    public void testArea() throws Exception {

        CalculateArea calArea = new CalculateArea();
Rectangle rec = new Rectangle(7.0,5.0);
        Circle circle = new Circle(5.0);
        Assert.assertEquals(calArea.getArea(rec ),35.0);
     Assert.assertEquals(calArea.getArea(circle),78.54);
    }
}
