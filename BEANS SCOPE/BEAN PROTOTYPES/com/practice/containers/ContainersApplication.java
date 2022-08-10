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


		System.out.println("Before creating Vehicle Bean");
		context.getBean(Vehicle.class);
		System.out.println("After creating Vehicle Bean");

		System.out.println("Before creating Person Bean");
		context.getBean(Person.class);
		System.out.println("After creating Person Bean");
	}

}
