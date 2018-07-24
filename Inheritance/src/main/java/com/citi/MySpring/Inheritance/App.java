package com.citi.MySpring.Inheritance;

import java.applet.AppletContext;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        ChildClass obj1 = (ChildClass) context.getBean("student1");
        
        ChildClass obj2 = (ChildClass) context.getBean("student2");
        
        System.out.println("Student obj1 :" +obj1);
        
        System.out.println("Student obj2 :"+obj2);
        
        
    }
}
