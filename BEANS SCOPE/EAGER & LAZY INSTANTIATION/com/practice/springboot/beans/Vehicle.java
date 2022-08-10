package com.practice.containers.beans;

import com.practice.containers.services.VehicleService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@ToString
@Component("vehicleBean")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {

    String vehicleName;

    @PostConstruct
    public void setName()
    {
        this.vehicleName="Audi";
    }

    public  Vehicle(VehicleService vehicleService)
    {
        System.out.println("Vehicle bean is getting created");
    }


}
