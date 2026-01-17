package com.InversionOfControl;

public class Square implements Shape {



    @Override
    public double getArea(double l) {
        return l*l;
    }

    @Override
    public double getPerimeter(double l) {
        return 4*l;
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
