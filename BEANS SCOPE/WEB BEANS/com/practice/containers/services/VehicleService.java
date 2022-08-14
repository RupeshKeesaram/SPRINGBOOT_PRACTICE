package com.practice.containers.services;

import com.practice.containers.implementations.Speakers;
import com.practice.containers.implementations.Tyres;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Getter
@Setter
@Slf4j
//@RequestScope  - creates bean for every HTTP request
//@SessionScope  - Creates bean for every session ( like users - chrome, microsoft edge)
@ApplicationScope // creates only one bean for entire application
public class VehicleService {

    int counter=0;

    VehicleService()
    {
        System.out.println("Service Bean is getting created !");
    }


    public String samp()
    {
     log.info("Called samp function");
     return "Hey hi";
    }
}


// application scope and singleton objects creates only one bean, but the differnce is we can have multiple contexts paths in single application, so that we can generate multiple beans using singleton also
//  but application scope irrespective of number of contexts, it will create only one bean for one application.
