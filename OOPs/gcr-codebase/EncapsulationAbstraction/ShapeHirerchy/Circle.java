package Encapsulation-abstraction.ShapeHirerchy.Shape hierarchy;

public class Circle extends Shape {
    private double radius;
    private double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public void Area() {
        System.out.println("Area of Circle is : " + (PI * radius * radius));
    }

    @Override
    public void Perimeter() {
        System.out.println("Circumference of Circle is : " + (2 * PI * radius));
    }

}
