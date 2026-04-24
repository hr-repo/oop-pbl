import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance In Meters :- ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.printf("Distance in Feet :- %.2f", feet);
    }
}