public class BankAccount {
    private double balance;
    private int accountNumber;
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
