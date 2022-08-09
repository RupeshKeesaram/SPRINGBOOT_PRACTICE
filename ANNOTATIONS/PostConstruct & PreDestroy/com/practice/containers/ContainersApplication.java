package com.practice.containers;

import com.practice.containers.beans.Vehicle;
import com.practice.containers.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		System.out.println(context.getBean(Vehicle.class).getName());

//		closing the context
		context.close();

// we will error saying the context already closed if we furthur try to access the context, uncomment the below line of code to check it out
//		System.out.println(context.getBean(Vehicle.class).getName());
	}

}
