package com.practice.containers.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component("personBean")
// @Setter       -- provides all setters
// @Getter       -- provides all getters
//@RequiredArgsConstructor  -- provides constructor with required arguments (  Lombok also provides AllArgsConstructor & NoArgsConstructor )
//@ToString                 -- Overrides toString() method
//@EqualsAndHashCode        -- Overrides Equals method

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


// @AllArgsConstructor generates a constructor with 1 parameter for each field in your class.

// @RequiredArgsConstructor generates a constructor with 1 parameter for each field that requires special handling. 
// All non-initialized final fields get a parameter, as well as any fields that are marked as @NonNull that aren't initialized where they are declared.

// In short, use @AllArgsConstructor  to generate a constructor for all of your class's fields and use @RequiredArgsConstructor to generate 
// a constructor for all class's fields that are marked as final.
