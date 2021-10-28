package com.learn.solid.openforextensionclosedformodification.correction;

public class Runner {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(4,6);
        System.out.println("Area is "+circle.area());
        System.out.println("Area is "+square.area());
        System.out.println("Area is "+rectangle.area());
    }
}
