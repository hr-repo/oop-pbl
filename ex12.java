import java.util.Scanner;
public class ex12 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolumeSphere(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex12 obj = new ex12();

        System.out.print("Enter Side of Cube :- ");
        double s = sc.nextDouble();
        System.out.println("Volume of Cube :- " + obj.calculateVolume(s));

        System.out.print("Enter Length :- ");
        double l = sc.nextDouble();
        System.out.print("Enter Width :- ");
        double w = sc.nextDouble();
        System.out.print("Enter Height :- ");
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube :- " + obj.calculateVolume(l, w, h));

        System.out.print("Enter Radius :- ");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere :- " + obj.calculateVolumeSphere(r));
    }
}