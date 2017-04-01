package DIPTest;
/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question3.DIP.Disobey.Domain.Car;
        import com.Question3.DIP.Disobey.Domain.Manufacture;


        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
public class DIPDisobeyTest {

    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void testDisplay() throws Exception {
        Car car = new Car("Honda", "5568-5426", 120);
        Manufacture manufacture = new Manufacture();
        manufacture.createCar(car);
        manufacture.displayDetails();
    }

    @Test
    public void testCarName() throws Exception {
        Car car = new Car("Honda", "5568-5426", 120);
        Assert.assertEquals(car.getPower(),120);
    }
}
