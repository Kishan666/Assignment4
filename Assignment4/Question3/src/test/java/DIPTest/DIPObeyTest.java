package DIPTest;
/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question3.DIP.Obey.Domain.Car;
import com.Question3.DIP.Obey.Domain.Manufacture;
import com.Question3.DIP.Obey.Service.BMWImp;
import com.Question3.DIP.Obey.Service.ToyotaImp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class DIPObeyTest {

    Manufacture manufacture;
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDetails() throws Exception {
      ToyotaImp to = new ToyotaImp();
      BMWImp bm = new BMWImp();


        Assert.assertEquals(to.getCarInfo().getName(),"Supra");
        Assert.assertEquals(bm.getCarInfo().getName(),"M3");

    }

    @Test
    public void testPower() throws Exception {
      ToyotaImp to = new ToyotaImp();
        BMWImp bm = new BMWImp();
        Assert.assertTrue(to.getCarInfo().getPower()>bm.getCarInfo().getPower());
    }

    @Test
    public void testManufacture() throws Exception {
      Manufacture manu = new Manufacture();
        manu.createCar(new ToyotaImp());
        manu.display();
    }

}
