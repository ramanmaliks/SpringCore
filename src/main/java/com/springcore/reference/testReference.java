package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/referenceconfig.xml");
		A t1 = (A) context.getBean("aref");
		System.out.println(t1.getX());
		System.out.println(t1.getOb().getY());
		System.out.println(t1);
	}

}
