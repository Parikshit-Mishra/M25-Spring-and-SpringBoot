package org.tnsindia.diobjects;
// class2
public class StudentK  {
	//2.DI in the forms of object
	MathCheat math;
	
	//DI using setter	
	public void setMath(MathCheat math) {
		this.math = math;
	}

	//MathCheat m=new MathCheat();
	public void cheating()
	{
		math.mathcheat();
	}

}
