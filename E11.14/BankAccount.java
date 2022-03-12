public class BankAccount {
    private double balance;
    public BankAccount() {
        balance = 0;
    }
    public BankAccount(double initialBalance) {
        if(initialBalance < 0)
            throw new IllegalInitialBalanceException("Initial balance can't be negative.");
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if(amount < 0)
            throw new IllegalDepositException("You can't deposit negative balance.");
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount < 0 || amount > balance)
            throw new InsufficientFundsException("You can't withdraw negative or more than balance amount.");
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
