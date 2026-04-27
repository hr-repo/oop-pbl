import java.util.Scanner;
public class ex10 {
    String account_holder_name;
    double balance;
    static double interest_rate = 5;

    ex10(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder Name :- " + account_holder_name);
        System.out.println("Balance :- " + balance);
        System.out.println("Interest Earned :- " + calculateInterest());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name :- ");
        String name = sc.nextLine();
        System.out.print("Enter Balance :- ");
        double bal = sc.nextDouble();

        ex10 acc = new ex10(name, bal);

        System.out.print("Enter New Interest Rate :- ");
        double rate = sc.nextDouble();
        updateInterestRate(rate);

        acc.display();
    }
}