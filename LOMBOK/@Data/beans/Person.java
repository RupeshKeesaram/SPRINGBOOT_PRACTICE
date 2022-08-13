package com.practice.containers.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component("personBean")
// @Setter
// @Getter
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
// @Data annotation from lombok enables all above five annotations
@Data
public class Person {
    String personName;


    @PostConstruct
    public void setName()
    {
        this.personName="Rupesh";
    }
}
