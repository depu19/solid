package com.learn.solid.openforextensionclosedformodification.violation;

/**
 * Are per Open closed principle, your code should be open for extension and closed for modification.
 * In the below code we see that each time a new shape is being introduced, we have to change the area calculation logic.
 * This could break the existing stable code.Hence its a violation
 */
public class Runner {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculateArea(new Shape("square",4,0,0));
        areaCalculator.calculateArea(new Shape("rectangle",4,6,0));
        areaCalculator.calculateArea(new Shape("circle",0,0,5));
    }
}
