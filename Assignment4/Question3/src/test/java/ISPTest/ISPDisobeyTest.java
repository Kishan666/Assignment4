package ISPTest;

import com.Question3.ISP.Disobey.Implementation.HpPrinterIspBad;
import com.Question3.ISP.Disobey.Implementation.XeroxPrinterIspBad;
import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class ISPDisobeyTest {
    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void testIspBad() throws Exception {

        XeroxPrinterIspBad xeBad = new XeroxPrinterIspBad();
        xeBad.print();
        xeBad.copy();
        xeBad.scan();


        HpPrinterIspBad hpBad = new HpPrinterIspBad();
        hpBad.print();
        hpBad.copy();
        hpBad.scan();

    }
}

