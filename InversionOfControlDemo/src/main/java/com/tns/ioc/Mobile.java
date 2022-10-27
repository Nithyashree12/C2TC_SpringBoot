package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		//Coventional
	/*Airtel a=new Airtel();
	a.calling();
	a.data();
	//hard coding
	Jio j=new Jio();
	j.calling();
	j.data();*/
		
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");
	/*	Jio j=c.getBean("jio",Jio.class);
		j.calling();
		j.data();*/
		
		
		//Generalizing
		Sim s=c.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
		
	}

}