package com.learn.solid.openforextensionclosedformodification.violation;

public class AreaCalculator {

    public void calculateArea(Shape shape){
        if("square".equalsIgnoreCase(shape.getType())) {
            System.out.println("Area is : "+shape.getLength()*4);
        }
        else if("rectangle".equalsIgnoreCase(shape.getType())){
            System.out.println("Area is : "+shape.getLength()*shape.getBreadth());
        }
        else if("circle".equalsIgnoreCase(shape.getType())){
            System.out.println("Area is : "+3.14*shape.getRadius()*shape.getRadius());
        }
    }
}
