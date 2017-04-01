package com.Question2.Configuration;

/**
 * Created by Kishan on 2017-03-31.
 */
import com.Question2.Service.StudentInterface;
import com.Question2.Service.StudImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(name="student")
    public StudentInterface getDetails(){return new StudImplementation();}



}
