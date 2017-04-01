package com.Question4.ADPObey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class Student {
    private String studNumber ="211059382";
    public boolean isValid(String studNum)
    {
        if(!studNum.equals(studNumber))
        {
        System.out.println("Invalid Student number");
        }
        else {
            System.out.println(studNum+" logged on");
        }
        return studNum.equals(studNumber);
    }
}
