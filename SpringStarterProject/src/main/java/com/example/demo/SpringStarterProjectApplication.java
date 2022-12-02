package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;




@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		/*int a=25;
		System.out.println("The value of a is :"+a);
		
		Student s= new Student();
		s.print();
		
		Employee e=new Employee();
		e.print();*/
		
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student e1=c.getBean(Student.class);
		e1.print();
	}
	

}
