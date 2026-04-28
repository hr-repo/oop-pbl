import java.util.Scanner;
interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Average :- ");
        double avg = sc.nextDouble();

        System.out.println("Division :- " + r.getDivision(avg));
    }
}