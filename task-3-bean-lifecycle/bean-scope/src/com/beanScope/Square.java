package com.beanScope;

public class Square implements Shape{
    private Draw2D draw2D;
    private Draw3D draw3D;

    @Override
    public void draw2D() {
        draw2D.draw2D("Square");
    }

    @Override
    public void draw3D() {
        draw3D.draw3D("Square");
    }

    @Override
    public double shapeArea(double l) {
        return l*l;
    }

    @Override
    public double shapePerimeter(double l) {
        return l*4;
    }

    //setter injection
    public void setDraw2D(Draw2D draw2D){
        this.draw2D=draw2D;
    }
    public void setDraw3D(Draw3D draw3D){
        this.draw3D=draw3D;
    }
}