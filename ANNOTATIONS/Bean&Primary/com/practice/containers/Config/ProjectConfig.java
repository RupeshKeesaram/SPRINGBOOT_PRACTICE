package com.practice.containers.config;


import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {


    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

//   When we have multiple beans of same type and when we try to access beans without providing name, we will get NoUniqueBean error, 
//   in order to overcome this error we can make one default bean with primary annotation ( this primary bean will be returned when we have multiple beans of same type 
//    and when no name is provided while accessing beans from the context )
//   
    @Primary
    @Bean
    Vehicle vehicle1()
    {
        Vehicle veh2 = new Vehicle();
        veh2.setName("Lamborgini");
        return veh2;
    }

    /*
    The method names usually follow verbs notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    bean names as well in the context.
    * */
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
