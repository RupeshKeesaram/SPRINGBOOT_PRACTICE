package com.practice.containers.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Getter
@Setter
@ToString
@Component("personBean")
@Lazy
public class Person {
    String personName;

    public Person(Vehicle vehicle)
    {
        System.out.println("Person bean is getting created");
        this.personName="Rupesh";
    }
}
