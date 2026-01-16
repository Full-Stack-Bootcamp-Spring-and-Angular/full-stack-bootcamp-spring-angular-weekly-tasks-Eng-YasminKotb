package com.InversionOfControl;

public class Circle implements Shape {

    @Override
    public double getArea(double r) {
        return ((double) 22 /7)*r*r;
    }

    @Override
    public double getPerimeter(double r) {
        return 2*((double) 22 /7)*r;
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
