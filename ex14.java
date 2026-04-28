import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance :- " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.06, years);
    }
}

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        sa.openAccount(1, "Hardik", 10000);
        sa.deposit(2000);
        sa.checkBalance();
        System.out.println("Saving Interest :- " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(2, "Raj", 20000);
        System.out.print("Enter Years :- ");
        int y = sc.nextInt();
        System.out.println("Maturity Amount :- " + fd.maturityAmount(y));
    }
}