package com.Question4Test;
import com.Question4.ADPDisobey.Student.StudentDisobey;
import com.Question4.ADPObey.Student;
import com.Question4.ADPObey.ValidateStudent;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Kishan on 2017-03-31.
 */
public class testStudentLogin {
    @Test
    public void testADPObey() throws Exception {

        ValidateStudent validSutdent = new ValidateStudent();

        Student stud = new Student();

        Assert.assertTrue(validSutdent.isValid());
    }
    @Test
    public void testADPDisobey() throws Exception {

        StudentDisobey user = new StudentDisobey();

        Assert.assertNotSame("21105938",user.isValid("211059382"));

    }
}