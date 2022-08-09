package com.practice.containers.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Getter
@Setter
@ToString
@Component("personBean")
public class Person {
    String personName;
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle =vehicle;
    }
}
