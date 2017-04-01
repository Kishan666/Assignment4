package PLKTest;

import com.Question3.PLK.Obey.CustomerOrderPlkGood;
import com.Question3.PLK.Obey.PizzaPlkGood;
import com.Question3.PLK.Obey.ToppingsPlkGood;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-03-31.
 */
public class PLKTestObey {
    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void testPlkGood() throws Exception
    {
        CustomerOrderPlkGood orderPizza = new CustomerOrderPlkGood();
        orderPizza.orderPizza();
        orderPizza.print();

    }
}
