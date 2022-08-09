package com.practice.containers.implementations;

import com.practice.containers.implementations.Speakers;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Setter
@Getter
@Component
public class SonySpeakers implements Speakers {
    public  String music;

    @PostConstruct
    public void addMusic()
    {
        this.music="Sony Speakers!!";
    }


    public String playMusic()
    {
        return "Music is playing with "+this.music;
    }


}
