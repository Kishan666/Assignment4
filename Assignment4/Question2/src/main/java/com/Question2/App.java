package com.Question2;

/**
 * Created by Kishan on 2017-03-31.
 */

import com.Question2.Domain.Student;
import com.Question2.Service.StudImplementation;
public class App {
    public static void main(String[] args)
    {
        Student student = new StudImplementation().getStudent();


        System.out.println("Student Details: "+student.toString());
        student.setAge(24);
        System.out.println("\n"+"Updated Student details: "+student.toString());


    }
}
