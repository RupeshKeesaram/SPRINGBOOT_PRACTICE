package com.practice.containers.config;


import com.practice.containers.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// below are the two different ways to search components using @ComponentScan Annotation
@ComponentScan(basePackages ={"com.practice.containers.implementations","com.practice.containers.services"})
@ComponentScan(basePackageClasses ={com.practice.containers.beans.Vehicle.class,com.practice.containers.beans.Person.class} )
public class ProjectConfig {

    @Bean
    public Vehicle samp()
    {
        Vehicle veh = new Vehicle();
        return veh;

    }
}
