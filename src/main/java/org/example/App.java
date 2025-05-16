package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        // Java Based Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        obj.code("Hritik");




        /*

        Desktop desk = context.getBean(Desktop.class);
        desk.compile();
        Desktop desk1 = context.getBean(Desktop.class);
        desk1.compile();

         */

    }
}


/*
XML based configuration
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code("Hritik");

 */