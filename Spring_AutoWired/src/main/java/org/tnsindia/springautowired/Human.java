package org.tnsindia.springautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	//Human is dependent on heart class
	//Dependency in term of object 
		
		private Heart heart;
		public void pumping()
		{
			heart.pump();
			System.out.println("Name of animal : "+heart.getNameOfAnimal()+
					" "+"No of heart"+heart.getNoOfHeart());
		}
		//achieving DI using setters
		@Autowired
		@Qualifier("Octopusheart")
		public void setHeart(Heart heart) {
			this.heart = heart;
		}
		//Achieving using constructor
		public Human(Heart heart) {
			super();
			this.heart = heart;
		}
		public Human() {
			super();
			this.heart=heart;
		}
		

}
