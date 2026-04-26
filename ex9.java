public class ex9 {
    double width;
    double height;

    ex9(double w, double h) {
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
        ex9 r1 = new ex9(4, 40);
        ex9 r2 = new ex9(3.5, 35.9);

        System.out.println("Rectangle 1");
        System.out.println("Width :- " + r1.width);
        System.out.println("Height :- " + r1.height);
        System.out.println("Area :- " + r1.getArea());
        System.out.println("Perimeter :- " + r1.getPerimeter());

        System.out.println("Rectangle 2");
        System.out.println("Width :- " + r2.width);
        System.out.println("Height :- " + r2.height);
        System.out.println("Area :- " + r2.getArea());
        System.out.println("Perimeter :- " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has larger area");
        } else {
            System.out.println("Both have equal area");
        }
    }
}