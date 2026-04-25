import java.util.Scanner;
public class ex6 {
    double width = 1;
    double height = 1;

    ex6() {
    }

    ex6(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width :- ");
        double w = sc.nextDouble();
        System.out.print("Enter Height :- ");
        double h = sc.nextDouble();

        ex6 r = new ex6(w, h);

        System.out.println("Area :- " + r.getArea());
        System.out.println("Perimeter :- " + r.getPerimeter());
    }
}