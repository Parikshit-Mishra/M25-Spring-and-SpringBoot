package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int rollno;
	private String name;
	//Setter and getter 
	/*public int getRollno() {
		return rollno;
	}*/
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//user define method
	public void print()
	{
		System.out.println("Welcom to NewYork");
	}
	public Student() {
		super();
		System.out.println("Welcom to Pune");
	}
	
}
