package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Alien {
    private  int age;
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }





//    private Laptop lap;
//
//    public Alien()
//    {
//        System.out.println("Alien object created.");
//    }
//
//    public Alien(int age, Laptop lap)
//    {
//        System.out.println("Constructor Called");
//        this.age = age;
//        this.lap = lap;
//    }



    public void code(String name)
    {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        comp.compile();
    }
}
