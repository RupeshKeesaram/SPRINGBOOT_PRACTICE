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
    System.out.println(context.getBean("wish"));
		System.out.println(context.getBean(Vehicle.class).getName());
	}

}
