package org.tnsindia.diobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Dl_Using_Objects {

	public static void main(String[] args) {
		//Using IOC
				@SuppressWarnings("resource")
				ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
				StudentK s1=c.getBean("s1",StudentK.class);
				s1.cheating();
			
	}

}
