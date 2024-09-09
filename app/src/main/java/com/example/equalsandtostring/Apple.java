package com.example.equalsandtostring;

public class Apple implements Eatable,Squeezable{

    @Override
    public void howToEat() {
        System.out.println("Wash and eat raw");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("With a fruit press");
    }
}
