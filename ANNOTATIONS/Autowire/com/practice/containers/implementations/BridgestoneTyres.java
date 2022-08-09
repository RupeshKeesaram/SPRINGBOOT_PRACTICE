package com.practice.containers.implementations;


import com.practice.containers.implementations.Tyres;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Setter
@Getter
@Component
public class BridgestoneTyres implements Tyres {

    public String tyre;

    // postconstruct to name tyres
    @PostConstruct
    public void addTyre()
    {
        this.tyre="BridgestoneTyre";
    }




    public String rotate()
    {
        return "Vehicle is moving with "+this.tyre;
    }

}
