package org.tnsindia.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		//Create object for Airtel
		
		/*Airtel aa = new Airtel();
		aa.calling();
		aa.data();
		
		//Create object for Jio
		
		Jio j = new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config...Loaded");
		
		/*Airtel a=(Airtel)c.getBean("airtel");
		a.data();
		a.calling();*/
		
		/*Jio j=(Jio)c.getBean("jio");
		j.data();
		j.calling();*/
		
		Sim a=c.getBean("sim",Sim.class);
		a.calling();
		a.data();
	}

}
