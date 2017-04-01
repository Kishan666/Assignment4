package com.Question3.PLK.Disobey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main (String[] args)
    {
        PizzaPlkBad pizza = new PizzaPlkBad();
        pizza.setSize("Large");
        pizza.setPrice(35);
        pizza.getTopping().setType("Ham");
        pizza.getTopping().setPrice(8);
        pizza.print();
    }
}
