package org.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        Student s = (Student) context.getBean( "st");
        System.out.println( "Hello World!" );
        s.intershipProgram();
//        context.getBean("fun");
        SpringBoot f = (SpringBoot) context.getBean("fun");
        f.hello("hello");

    }
}
