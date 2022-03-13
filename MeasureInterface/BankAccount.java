public class BankAccount implements Comparable, Cloneable {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialAmount) {
        balance = initialAmount;
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

    @Override
    public int compareTo(Object o) {
        BankAccount account = (BankAccount) o;
        return Double.compare(this.balance, account.balance);
    }

    public Object clone() throws CloneNotSupportedException {
        Object clonedObject = super.clone();
        return clonedObject;
    }
}
