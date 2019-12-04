package com.company;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(3.0);
        figures[1] = new Rectangle(2.0, 3.0);
        figures[2] = new Triangle(5.0, 3.0, 4.2);
        figures[3] = new Square(3.0);
        figures[4] = new Rectangle(12.0, 6.5);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(i + " ("
                    + figures[i].getName() + ((Drawable) figures[i]).draw() + ") Периметр фигуры = "
                    + figures[i].calculatePerimeter());
        }

Dog dog= new Dog("Шарик");
        System.out.println(dog.getName());
        System.out.println(dog.draw());
        dog.callSound();
    }
    }

