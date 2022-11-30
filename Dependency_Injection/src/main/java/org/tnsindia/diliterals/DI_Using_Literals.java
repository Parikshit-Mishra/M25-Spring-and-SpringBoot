package org.tnsindia.diliterals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DI_Using_Literals {

	public static void main(String[] args) {
		//hard coding
		/*Student s=new Student();
		s.setStudent_Name("Parikshit M");
		s.disply();*/
		
		//Using IOC
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBean("s1",Student.class);
		Student s2=c.getBean("s2",Student.class);
		s1.disply();
		s2.disply();
		
		
		
		

	}

}
