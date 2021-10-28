package com.learn.solid.openforextensionclosedformodification.violation;

public class Shape {
    private String type;
    private int length;
    private int breadth;
    private int radius;

    public Shape(String type, int length, int breadth, int radius) {
        this.type = type;
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getRadius() {
        return radius;
    }
}
