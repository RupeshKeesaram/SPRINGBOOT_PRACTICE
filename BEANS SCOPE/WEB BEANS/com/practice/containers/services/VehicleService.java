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
//@RequestScope
//@SessionScope
@ApplicationScope
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

//    field style autowiring
    @Autowired()
    public  Speakers speakers;
    public Tyres tyres;



//    setter style of autowiring ( method style)
    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void playMusic()
    {
        String sound = speakers.playMusic();
        System.out.println(sound);
    }


    public void moveCar()
    {
        String tyre = tyres.rotate();
        System.out.println(tyre);
    }
}
