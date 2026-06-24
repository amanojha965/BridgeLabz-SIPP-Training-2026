package ShapeHirerchy;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void Area() {
        System.out.println("Area of Rectangle is : " + (length * breadth));
    }

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of Rectangle is : " + (2 * (length + breadth)));
    }

    
}