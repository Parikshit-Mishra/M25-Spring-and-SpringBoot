package org.tnsindia.springbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*StudentDao obj=new StudentDao();
		obj.selectAllRows();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		StudentDao s1=c.getBean("studentdao",StudentDao.class);
		s1.selectAllRows();
	}

}
