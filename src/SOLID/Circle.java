package SOLID;

public class Circle implements Shape {
    private static final double pi = 3.14;
    private double radius;

    Circle(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return pi*radius*radius;
    }
}
