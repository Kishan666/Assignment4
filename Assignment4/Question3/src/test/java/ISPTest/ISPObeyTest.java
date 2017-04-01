package ISPTest;

import com.Question3.ISP.Obey.Implementation.HpPrinterIspGood;
import com.Question3.ISP.Obey.Implementation.XeroxPrinterIspGood;
import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class ISPObeyTest {
    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void testIspGood() throws Exception {

        XeroxPrinterIspGood xe = new XeroxPrinterIspGood();
        xe.print();
        xe.copy();
        xe.scan();

        HpPrinterIspGood hp = new HpPrinterIspGood();
        hp.print();
        hp.copy();
    }
}
