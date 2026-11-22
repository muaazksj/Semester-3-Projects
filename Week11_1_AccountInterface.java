package Muaaz;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

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
}

class Current implements Account {
    public void deposit(double amount) {
        System.out.println("Current account: Rs. " + amount + " deposited.");
    }

    public void withdraw(double amount) {
        System.out.println("Current account: Rs. " + amount + " withdrawn.");
    }
}

public class Week11_1_AccountInterface {
    public static void main(String[] args) {
        Saving saving = new Saving();
        Current current = new Current();

        Account.aboutBank();

        saving.deposit(5000.0);
        saving.withdraw(1500.0);

        current.deposit(20000.0);
        current.withdraw(7500.0);
    }
}
