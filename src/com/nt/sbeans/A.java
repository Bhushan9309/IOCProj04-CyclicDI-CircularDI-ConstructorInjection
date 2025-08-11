package com.nt.sbeans;

public class A 
{
	private B b;

	/*public A(B b)
	{
		this.b=b;
		System.out.println("A::1-param constructor");
	}*/
	//One Side Setter Injection 
	public void setB(B b)
	{
		System.out.println("A.setB()");
		this.b=b;
	}
	
	public String toString()
	{
		return "from A...";
	}

}
