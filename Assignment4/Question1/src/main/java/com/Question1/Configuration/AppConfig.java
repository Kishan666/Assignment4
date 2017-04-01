package com.Question1.Configuration;

/**
 * Created by Kishan on 2017-03-30.
 */
import com.Question1.Interface.ShapeInterface;
import com.Question1.Implementation.CircleImplementation;
import com.Question1.Implementation.SquareImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean (name="square")
    public ShapeInterface getSquare() {return new SquareImplementation();}
    @Bean (name="circle")
    public ShapeInterface getCircle(){return new CircleImplementation();}
}