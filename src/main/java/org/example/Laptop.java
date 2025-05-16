package org.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop implements Computer {

    public  Laptop()
    {
        System.out.println("Laptop Object created.......");
    }
    @Override
    public void compile(){

        System.out.println("Compiling Using Laptop.");
    }
}