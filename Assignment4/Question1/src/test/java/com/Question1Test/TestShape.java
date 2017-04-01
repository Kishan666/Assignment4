package com.Question1Test;

import com.Question1.Configuration.AppConfig;
import com.Question1.Domain.Shape;

import com.Question1.Interface.ShapeInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Kishan on 2017-03-30.
 */

public class TestShape {
    private ShapeInterface shape ,shape2;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        shape = (ShapeInterface) ctx.getBean("circle");


    }

    @Test
    public void testNumSides() throws Exception {
        Shape sh = shape.getShape();
        //System.out.println("sdsd:" + shape.getShape().toString());
        Assert.assertEquals(sh.getnumOfSides(),0);
    }
    @Test
    public void testColour() throws Exception {
        Shape sh = shape.getShape();
        //System.out.println("sdsd:" + shape.getShape().toString());
        Assert.assertEquals(sh.getColour(),"Blue");
    }
    @Test
    public void testShapeDetails() throws Exception {
        Shape sh = shape.getShape();
        System.out.println(sh.toString());
    }


}






