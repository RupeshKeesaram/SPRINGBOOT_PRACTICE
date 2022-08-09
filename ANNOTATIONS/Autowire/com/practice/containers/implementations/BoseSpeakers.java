package com.practice.containers.implementations;

import com.practice.containers.implementations.Speakers;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Primary
@Getter
@Setter
@Component
public class BoseSpeakers implements Speakers {
    public  String music;

    @PostConstruct
    public void addMusic()
    {
        this.music="Bose Speakers!!";
    }


    public String playMusic()
    {
        return "Music is playing with "+this.music;
    }
}
