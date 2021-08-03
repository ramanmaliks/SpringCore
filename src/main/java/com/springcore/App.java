package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // xml file setter using property tag with value as element
        Student student1 = (Student) context.getBean("student1");
        // xml file setter using value attribute in property tag
        Student student2 = (Student) context.getBean("student2");
        // xml file setter using p schema code in bean for setting /inserting values
        Student student3 = (Student) context.getBean("student3");
        
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
