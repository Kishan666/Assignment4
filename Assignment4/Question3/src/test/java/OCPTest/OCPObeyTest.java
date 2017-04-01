package OCPTest;

import com.Question1.Domain.Square;
import com.Question3.OCP.Obey.CalculateArea;
import com.Question3.OCP.Obey.Circle;
import com.Question3.OCP.Obey.Rectangle;
import com.Question3.OCP.Obey.Shape;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31
 */
public class OCPObeyTest {
    @Before
    public void setUp() throws Exception
    {


    }
    @Test
    public void testArea() throws Exception {
        Rectangle rectangle =new Rectangle(7.0,5.0);

        Circle circle = new Circle(5.0);

        CalculateArea calArea = new CalculateArea();
        Assert.assertEquals(calArea.getArea(circle),78.0);
        Assert.assertEquals(calArea.getArea(rectangle),35.0);
    }
}