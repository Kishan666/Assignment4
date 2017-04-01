package com.Question4.ADPDisobey.Student;
import com.Question4.ADPObey.StudentLogin;
/**
 * Created by Kishan on 2017-03-31.
 */
public class StudentDisobey {
    StudentLogin studLogin = new StudentLogin();
    public boolean isValid(String studNum)
    {
        if(!studNum.equals(studLogin.getStudNum()))
        {
            System.out.println("Invalid student number");
        }
        else{
            System.out.println(studNum+" logged in");
        }
        return studNum.equals(studLogin.getStudNum());
    }

}
