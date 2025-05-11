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

        /*
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
            Creates an ApplicationContext object by loading the Spring configuration file Spring.xml. This initializes the Spring container and loads the bean definitions.
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        Laptop ob1 = (Laptop) context.getBean("lap");
        obj.code("Hritik");
        ob1.compile();

    }
}
