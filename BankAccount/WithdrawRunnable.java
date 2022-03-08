public class WithdrawRunnable implements Runnable {
    private static final int DELAYS = 1;
    private BankAccount account;
    private double amount;
    private int count;

    public WithdrawRunnable(BankAccount account, double amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            account.withdraw(amount);
            Thread.sleep(DELAYS);
        } catch (InterruptedException e) {
        }
    }
}
