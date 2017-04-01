package LSPTest;

import com.Question3.LSP.Obey.Domain.ColourPrintLspGood;
import com.Question3.LSP.Obey.Domain.NonColourPrintLspGood;
import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class LSPObeyTest {
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testLspGood() throws Exception {
        ColourPrintLspGood printLspGood = new ColourPrintLspGood();
        NonColourPrintLspGood test = new NonColourPrintLspGood();
        test = printLspGood;
        printLspGood.print(1, 2, 3);

    }
}
