package com.practice.containers;

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

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//	We will get error saying 'No qualifying bean of type' if we un comment below line because we remote @Component at Vehicle class, so spring won't create any beans of type Vehicle
//		System.out.println(context.getBean(Vehicle.class).getName());
		System.out.println(context.getBean("wish"));

		Supplier<Vehicle> sampleBean = ()->{
			Vehicle veh = new Vehicle();
			veh.setName("Hey I'm Programmatically created bean");
			return veh;
		};

		context.registerBean("vehicle",Vehicle.class,sampleBean);
//		Context will return programmatically created bean 
		System.out.println(context.getBean(Vehicle.class).getName());


//		closing the context
		context.close();

// we will error saying the context already closed if we furthur try to access the context, uncomment the below line of code to check it out
//		System.out.println(context.getBean(Vehicle.class).getName());
	}

}
