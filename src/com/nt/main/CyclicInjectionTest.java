package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicInjectionTest 
{

	public static void main(String[] args) 
    {
	  //create IOC container 
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj ref
		A a1 =(A)ctx.getBean("a1");
		System.out.println("a1==: "+a1);
		System.out.println("==============================");
		B b1 =(B)ctx.getBean("b1");
		System.out.println("b1==: "+b1);
		
		//close the IOC Container
		ctx.close();
		

	}

}
