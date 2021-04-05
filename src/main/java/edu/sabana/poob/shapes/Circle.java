package edu.sabana.poob.shapes;

public class Circle extends Shape {

    private double radius;
    static final double pi = 3.1416;

    Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s and radius %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color
                , this.radius);
    }
}
