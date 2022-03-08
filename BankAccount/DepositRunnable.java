public class DepositRunnable implements Runnable {
    private static final int DELAYS = 10;
    private BankAccount account;
    private double amount;
    private int count;

    public DepositRunnable(BankAccount account, double amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                account.deposit(amount);
                Thread.sleep(DELAYS);
            }
        } catch (InterruptedException e) {
        }
    }

}
