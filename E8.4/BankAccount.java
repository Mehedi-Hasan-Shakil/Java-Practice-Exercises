public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double amount) {
        balance = amount;
    }

    public BankAccount deposit(double amount) {
        return new BankAccount(balance + amount);
    }

    public BankAccount withdraw(double amount) {
        return new BankAccount(balance - amount);
    }

    public double getBalance() {
        return balance;
    }
}
