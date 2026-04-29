import student.Student;

public class Result extends Student {
    int m1, m2, m3;

    public Result(int r, String n, int a, int b, int c) {
        super(r, n);
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void displayResult() {
        displayStudent();
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
        System.out.println("Marks :- " + m1 + " " + m2 + " " + m3);
        System.out.println("Total :- " + total);
        System.out.println("Average :- " + avg);
    }

    public static void main(String[] args) {
        Result r = new Result(1, "Hardik", 70, 80, 90);
        r.displayResult();
    }
}