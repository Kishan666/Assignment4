package LSPTest;

import com.Question3.LSP.Disobey.PrinterLspBad;
import com.Question3.LSP.Obey.Domain.ColourPrintLspGood;
import com.Question3.LSP.Obey.Domain.NonColourPrintLspGood;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class LSPDisobeyTest {
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testLspBad() throws Exception {
        PrinterLspBad printLspBad = new PrinterLspBad();
        printLspBad.print(3);
        try {
         printLspBad.print(1,2,3);
        }catch(Exception e)
        {
            System.out.println("This printer cannot print in colour.");
        }

    }


}
