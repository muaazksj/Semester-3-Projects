package Muaaz;

class Account {
    int id;
    String accountHolderName;
    String address;
    double balance;

    Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". Balance = " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount + ". Balance = " + balance);
        }
    }

    static double calculateSimpleInterest(double principal, double rate, double years) {
        return (principal * rate * years) / 100;
    }

    static double calculateCompoundInterest(double principal, double rate, double years) {
        return principal * Math.pow(1 + rate / 100, years) - principal;
    }
}

public class Week9_3_AccountStaticMethods {
    public static void main(String[] args) {
        Account account = new Account(101, "Amit Kumar", "Aligarh", 10000.0);

        account.deposit(2000.0);
        account.withdraw(500.0);

        double simple = Account.calculateSimpleInterest(10000.0, 5.0, 2.0);
        double compound = Account.calculateCompoundInterest(10000.0, 5.0, 2.0);

        System.out.printf("Simple interest = %.2f%n", simple);
        System.out.printf("Compound interest = %.2f%n", compound);
    }
}
