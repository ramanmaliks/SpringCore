package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		emp emp1= (emp) context.getBean("emp1");
		
		
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddressess());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getCoursedetail());
	
	
	}
	

}
