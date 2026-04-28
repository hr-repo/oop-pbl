class Employee {
    void displayDetails() {
        System.out.println("Employee Name :- Hardik");
        System.out.println("Department :- Computer");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager Name :- Mr.Goenka");
        System.out.println("Department :- Computer");
        System.out.println("Team Size :- 10");
    }
}

public class ex15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayDetails();

        Manager m = new Manager();
        m.displayDetails();
    }
}