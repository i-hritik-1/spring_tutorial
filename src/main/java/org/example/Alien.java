package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Alien {

    public Alien()
    {
        System.out.println("Object Created.");
    }

    public void code(String name)
    {
        System.out.println("Alien "  + name + " is coding right now..... ");
    }
}
