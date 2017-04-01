package com.Question2Test;

/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question2.Configuration.AppConfig;
import com.Question2.Domain.Student;
import com.Question2.Service.StudentInterface;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testStudent {
    private StudentInterface stud;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        stud =(StudentInterface) ctx.getBean("student");
    }

    @Test
    public void testStudentDetails() throws Exception {
        Student student = stud.getStudent();
        System.out.println(student.toString());
    }

    @Test
    public void testName() throws Exception {
        Student student = stud.getStudent();
        Assert.assertEquals(student.getName(),"Kishan");
        Assert.assertEquals(student.getSurname(),"Parsotam");
    }
}
