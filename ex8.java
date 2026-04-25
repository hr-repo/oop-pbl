import java.util.Scanner;
public class ex8 {
    int x;
    int y;

    ex8() {
        x = 5;
        y = 5;
    }

    ex8(int a, int b) {
        x = a;
        y = b;
    }

    ex8(ex8 p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point :- (" + x + "," + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ex8 p1 = new ex8();
        System.out.println("Default Constructor");
        p1.display();

        System.out.print("Enter x :- ");
        int a = sc.nextInt();
        System.out.print("Enter y :- ");
        int b = sc.nextInt();

        ex8 p2 = new ex8(a, b);
        System.out.println("Parameterized Constructor");
        p2.display();

        ex8 p3 = new ex8(p2);
        System.out.println("Copy Constructor");
        p3.display();
    }
}