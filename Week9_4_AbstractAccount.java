package Muaaz;

abstract class Account {
    int id;
    String accountHolderName;
    String address;

    Account(int id, String accountHolderName, String address) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class BasicAccount extends Account {
    double balance = 0.0;

    BasicAccount(int id, String accountHolderName, String address) {
        super(id, accountHolderName, address);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". Balance = " + balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + ". Balance = " + balance);
    }
}

public class Week9_4_AbstractAccount {
    public static void main(String[] args) {
        Account account = new BasicAccount(101, "Amit Kumar", "Aligarh");

        System.out.println("Id: " + account.id);
        System.out.println("Name: " + account.accountHolderName);
        System.out.println("Address: " + account.address);

        account.deposit(3000.0);
        account.withdraw(1000.0);
    }
}
