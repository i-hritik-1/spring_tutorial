package org.example;

public class Alien {

    public Alien()
    {
        System.out.println("Alien object created......");
    }

    private int age;
    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(String name)
    {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
//        comp.compile();
    }
}

/*

//    private  int age;
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

 */