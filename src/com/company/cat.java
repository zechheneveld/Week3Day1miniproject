package com.company;

public class cat extends animal {

    public cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }
}
