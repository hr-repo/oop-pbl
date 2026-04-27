import java.util.Scanner;
public class ex11 {
    String collegeName;

    ex11(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name :- ");
            studentName = sc.nextLine();
            System.out.print("Enter Course :- ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("College Name :- " + collegeName);
            System.out.println("Student Name :- " + studentName);
            System.out.println("Course :- " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name :- ");
        String cname = sc.nextLine();

        ex11 college = new ex11(cname);

        ex11.Admission ad = college.new Admission();
        ad.readData();
        ad.displayData();
    }
}