package com.example.equalsandtostring;

public class InterfaceMain {
    public static void main(String args[]){
        Object lion = new Lion();
        Apple apple = new Apple();
        GoldenDeliciousApple goldenApple = new GoldenDeliciousApple();
        Eatable chicken = new Chicken();

        Object[] objects = new Object[]{lion,apple,goldenApple,chicken};

        for (Object o: objects) {
            if (o instanceof Eatable){
                ((Eatable)o).howToEat();
            }

            if (o instanceof Squeezable){
                ((Squeezable)o).howToSqueeze();
            }

        }
    }
}
