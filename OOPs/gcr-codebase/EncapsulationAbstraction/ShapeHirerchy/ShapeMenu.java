package ShapeHirerchy;

import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs {

    @Override
    public void choices() {

        Shape s;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SHAPE MENU =====");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Rectangle r = new Rectangle();

                    System.out.print("Enter Length: ");
                    r.setLength(sc.nextInt());

                    System.out.print("Enter Breadth: ");
                    r.setBreadth(sc.nextInt());

                    s = r;
                    s.Area();
                    s.Perimeter();
                    break;

                case 2:
                    Triangle t = new Triangle();

                    System.out.print("Enter Height: ");
                    t.setHeight(sc.nextInt());

                    System.out.print("Enter Base: ");
                    t.setBase(sc.nextInt());

                    System.out.print("Enter Side A: ");
                    t.setA(sc.nextInt());

                    System.out.print("Enter Side B: ");
                    t.setB(sc.nextInt());

                    System.out.print("Enter Side C: ");
                    t.setC(sc.nextInt());

                    s = t;
                    s.Area();
                    s.Perimeter();
                    break;

                case 3:
                    Circle c = new Circle();

                    System.out.print("Enter Radius: ");
                    c.setRadius(sc.nextDouble());

                    s = c;
                    s.Area();
                    s.Perimeter();
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}