package Muaaz;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    default void takeLoan() {
        System.out.println("Loan facility is not available for this account.");
    }

    static void aboutBank() {
        System.out.println("ABC Bank: safe and secure banking.");
    }
}

class Saving implements Account {
    public void deposit(double amount) {
        System.out.println("Saving account: Rs. " + amount + " deposited.");
    }

    public void withdraw(double amount) {
        System.out.println("Saving account: Rs. " + amount + " withdrawn.");
    }

    public void takeLoan() {
        System.out.println("Saving account: loan of up to Rs. 50000 is available.");
    }
}

class Current implements Account {
    public void deposit(double amount) {
        System.out.println("Current account: Rs. " + amount + " deposited.");
    }

    public void withdraw(double amount) {
        System.out.println("Current account: Rs. " + amount + " withdrawn.");
    }
}

public class Week11_2_AccountDefaultLoan {
    public static void main(String[] args) {
        Saving saving = new Saving();
        Current current = new Current();

        Account.aboutBank();

        saving.deposit(5000.0);
        saving.withdraw(1500.0);
        saving.takeLoan();

        current.deposit(20000.0);
        current.withdraw(7500.0);
        current.takeLoan();
    }
}
