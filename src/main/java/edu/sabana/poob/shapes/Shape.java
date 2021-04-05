package edu.sabana.poob.shapes;

public abstract class Shape {

    public String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("This is a %s with color %s and radius %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);

    }
}
