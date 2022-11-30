package org.tnsindia.springautowired;
//Class
public class Heart {
	
	//Dependency in term of Literls
	
	private String nameOfAnimal;
	private int noOfHeart;
	//Getter and setter
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}



	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}



	public int getNoOfHeart() {
		return noOfHeart;
	}



	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}



	//method
	public void pump ()
	{
		System.out.println("Your Heart is pumping");
		System.out.println("Your are alive");
	}

}
