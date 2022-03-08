import com.sun.deploy.util.SyncAccess;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private Lock balanceChangeLock;
    private Condition sufficientFundsCondition;

    public BankAccount() {
        balanceChangeLock = new ReentrantLock();
        sufficientFundsCondition = balanceChangeLock.newCondition();
        balance = 0;
    }

    public void deposit(double amount) {
        balanceChangeLock.lock();
        try {
            System.out.print("Depositing " + amount);
            double newBalance = balance + amount;
            System.out.println(", new balance is " + newBalance);
            balance = newBalance;
            sufficientFundsCondition.signalAll();
        } finally {
            balanceChangeLock.unlock();
        }
    }

    public void withdraw(double amount) throws InterruptedException {
        balanceChangeLock.lock();
        try {
            if (balance < amount) {
                sufficientFundsCondition.await();
            }
            System.out.print("Withdrawing " + amount);
            double newBalance = balance - amount;
            System.out.println(", new balance is " + newBalance);
            balance = newBalance;
        } finally {
            balanceChangeLock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}
