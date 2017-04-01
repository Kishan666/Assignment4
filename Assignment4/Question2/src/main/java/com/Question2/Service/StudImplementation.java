package com.Question2.Service;

/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question2.Domain.Student;
import com.Question2.Domain.Person;


public class StudImplementation implements StudentInterface {
    public Student getStudent(){
        Person person = new Person("Kishan","Parsotam",23);
        Student stud = new Student("211059382",person);
        return stud;
    }
}
