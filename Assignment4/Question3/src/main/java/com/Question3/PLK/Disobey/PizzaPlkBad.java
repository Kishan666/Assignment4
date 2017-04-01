package com.Question3.PLK.Disobey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class PizzaPlkBad {
    private int price;
    private String size;
    private ToppingsPlkBad topping = new ToppingsPlkBad();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ToppingsPlkBad getTopping() {
        return topping;
    }

    public void setTopping(ToppingsPlkBad topping) {
        this.topping = topping;
    }

    public void print()
    {
        System.out.println(getSize() + " pizza with " + topping.getType());
        System.out.println("Total cost = R" + (getPrice()+topping.getPrice()));
    }
}
