package com.Question4.ADPObey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class ValidateStudent {
    public boolean isValid()
    {
        StudentLogin studLogin = new StudentLogin();
        Student stud = new Student();
        return stud.isValid(studLogin.getStudNum());
    }
}
