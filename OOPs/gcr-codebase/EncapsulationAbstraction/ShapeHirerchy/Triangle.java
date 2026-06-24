package ShapeHirerchy;

public class Triangle extends Shape {
    private int height;
    private int base;
    private int a;
    private int b;
    private int c;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void Area() {
        System.out.println("Area of Triangle is : " + ((height * base) / 2.0));
    }

    @Override
    public void Perimeter() {
        System.out.println("Perimeter of Triangle is : " + (a + b + c));
    }
}
