package com.company;

public class Dog extends Animal implements  Drawable,SoundProducable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return  "\uD83D\uDC15";
    }

    @Override
    public void callSound() {
        System.out.println("GAW-GAW");
    }
}
