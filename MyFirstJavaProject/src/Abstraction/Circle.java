package Abstraction;

public class Circle extends Shape{
    double rad;
    Circle(double rad) {
        this.rad = rad;
    }

    double area() {
        return Math.PI *  Math.pow(rad, 2);
    }
}
