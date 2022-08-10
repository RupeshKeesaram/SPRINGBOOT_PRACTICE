package com.practice.containers;

import com.practice.containers.beans.Person;
import com.practice.containers.beans.Vehicle;
import com.practice.containers.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class ContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);

		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ProjectConfig.class);

    
    // singleton scope bean will be created only one time and will be reused whenever required, but in case of prototype scope
    // new bean will be created for each and every instance of specific type
    
    
    // by default the scope of spring beans are singleton scope, we can modify with the help of scope annotation
    
    
    
    // here we declared the scope for vehicle bean as prototype, so our appliction will create two beans as follows
		// creates first bean
		Vehicle veh1 = context.getBean(Vehicle.class);

		// creates another new bean
		Vehicle veh2 = context.getBean(Vehicle.class);

	}

}
