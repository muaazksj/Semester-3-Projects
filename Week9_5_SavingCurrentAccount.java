package Muaaz;

abstract class Account {
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

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class Saving extends Account {
    double minBalance;

    Saving(int id, String accountHolderName, String address, double balance, double minBalance) {
        super(id, accountHolderName, address, balance);
        this.minBalance = minBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Saving: deposited " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Saving: withdrawal denied, minimum balance must be maintained.");
        } else {
            balance = balance - amount;
            System.out.println("Saving: withdrawn " + amount);
        }
    }

    void display() {
        System.out.println("Saving Account " + id + " | " + accountHolderName + " | " + address);
        System.out.println("Balance = " + balance + ", Minimum balance = " + minBalance);
    }
}

class Current extends Account {
    double maxWithdrawalLimit;

    Current(int id, String accountHolderName, String address, double balance, double maxWithdrawalLimit) {
        super(id, accountHolderName, address, balance);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current: deposited " + amount);
    }

    void withdraw(double amount) {
        if (amount > maxWithdrawalLimit) {
            System.out.println("Current: withdrawal denied, limit exceeded.");
        } else if (amount > balance) {
            System.out.println("Current: insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Current: withdrawn " + amount);
        }
    }

    void display() {
        System.out.println("Current Account " + id + " | " + accountHolderName + " | " + address);
        System.out.println("Balance = " + balance + ", Max withdrawal limit = " + maxWithdrawalLimit);
    }
}

public class Week9_5_SavingCurrentAccount {
    public static void main(String[] args) {
        Saving saving = new Saving(101, "Amit Kumar", "Aligarh", 10000.0, 2000.0);
        Current current = new Current(202, "Sara Khan", "Delhi", 20000.0, 5000.0);

        saving.deposit(1500.0);
        saving.withdraw(9000.0);
        saving.withdraw(1000.0);
        saving.display();

        current.deposit(5000.0);
        current.withdraw(8000.0);
        current.withdraw(4000.0);
        current.display();
    }
}
