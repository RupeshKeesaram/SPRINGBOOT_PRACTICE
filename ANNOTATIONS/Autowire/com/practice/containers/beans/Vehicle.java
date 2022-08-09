package com.practice.containers.services;

import com.practice.containers.implementations.Speakers;
import com.practice.containers.implementations.Tyres;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class VehicleService {

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
