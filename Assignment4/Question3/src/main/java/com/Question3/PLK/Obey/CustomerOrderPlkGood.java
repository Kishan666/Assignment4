package com.Question3.PLK.Obey;


/**
 * Created by Kishan on 2017-03-31.
 */
public class CustomerOrderPlkGood
{
    private ToppingsPlkGood topping;
    private PizzaPlkGood pizza;

    public void orderPizza()
    {
        pizza = new PizzaPlkGood();
        pizza.setPrice(35);
        pizza.setSize("Large");

        topping = new ToppingsPlkGood();
        topping.setType("Ham");
        topping.setPrice(8);
    }

    public void print()
    {
        System.out.println(pizza.getSize() + " pizza with " + topping.getType());
        System.out.println("Total cost = R" + (pizza.getPrice()+topping.getPrice()));
    }
}
