package src.com.beanInitDestroy;

public class Circle implements Shape {
    private Draw2D draw2D;
    private Draw3D draw3D;
    private DatabaseOperations databaseOperations;

    //constructor injection
    public Circle(Draw2D draw2D){
        this.draw2D=draw2D;
    }
    public Circle(Draw3D draw3D){
        this.draw3D=draw3D;
    }
    public Circle(DatabaseOperations databaseOperations){
        this.databaseOperations=databaseOperations;
    }


    @Override
    public void storeShape(){
        databaseOperations.storeShapeIntoDatabase("Ciecle");
    }
    @Override
    public void draw2D() {
        draw2D.draw2D("Circle");
    }

    @Override
    public void draw3D() {
        draw3D.draw3D("Circle");
    }

    @Override
    public double shapeArea(double r) {
        return ((double)22/7 *r*r);
    }

    @Override
    public double shapePerimeter(double r) {
        return ((double)22/7 *r*r);
    }
}