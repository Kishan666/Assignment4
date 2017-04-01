package com.Question4;

import java.util.Scanner;
import com.Question4.ADPObey.Student;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main(String[] args)
    {
        String studNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student number:");
        studNum = sc.nextLine();
        Student stud = new Student();
        stud.isValid(studNum);
    }
}
