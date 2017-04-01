package PLKTest;

import com.Question3.PLK.Disobey.PizzaPlkBad;

import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */

public class PLKTestDisobey {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPlkBad() throws Exception
    {
        PizzaPlkBad pizza = new PizzaPlkBad();
       pizza.setSize("Large");
        pizza.setPrice(35);
        pizza.getTopping().setType("Ham");
        pizza.getTopping().setPrice(8);
        pizza.print();
    }
}
