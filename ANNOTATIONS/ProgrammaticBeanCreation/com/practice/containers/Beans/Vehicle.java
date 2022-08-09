package com.practice.containers.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    String name;

//    We don't have control over the beans that got created with the help of sterotype annotations
//    So if we want to add our own business login to the beans, we can use this annotation
    @PostConstruct
    public void add()
    {
        this.name="Rupesh";
        System.out.println("Name got initialized as "+this.name);
    }


//    This method will called while closing the context, important operations like DB closing and etc can be handled here
//    By default spring boot will take all the closing related things, if you want to add more operations during closing of context, @PreDestroy annotation is used.
    @PreDestroy
    public void destroy()
    {
        this.name="";
        System.out.println("Closing all the connections");
    }
}
