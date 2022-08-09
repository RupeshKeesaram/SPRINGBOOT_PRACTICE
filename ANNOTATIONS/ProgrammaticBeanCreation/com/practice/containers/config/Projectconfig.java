package com.practice.containers.config;


import com.practice.containers.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages ="com.practice.containers.beans")
public class ProjectConfig {

//    @Bean
//    Vehicle vehicle(){
//        Vehicle veh = new Vehicle();
//        veh.setName("Rupee");
//        return veh;
//    }
//
    @Bean
    String wish()
    {
        return "Hey Hi Mawa";
    }

//
//    @Primary
//    @Bean
//    Vehicle vehicle1()
//    {
//        Vehicle veh2 = new Vehicle();
//        veh2.setName("Lamborgini");
//        return veh2;
//    }
//
//    @Bean
//    Integer integer(){
//        return 10;
//    }
}
