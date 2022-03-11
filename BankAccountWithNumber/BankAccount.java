public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        balance = amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
