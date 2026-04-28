import java.util.Scanner;
class Shape {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.print("Enter Base :- ");
        double b = sc.nextDouble();
        System.out.print("Enter Height :- ");
        double h = sc.nextDouble();
        t.getData(b, h);
        System.out.println("Triangle Area :- " + t.getArea());

        Rectangle r = new Rectangle();
        System.out.print("Enter Length :- ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth :- ");
        double br = sc.nextDouble();
        r.getData(l, br);
        System.out.println("Rectangle Area :- " + r.getArea());
    }
}