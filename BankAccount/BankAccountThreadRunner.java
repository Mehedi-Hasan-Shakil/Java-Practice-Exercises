import sun.awt.windows.ThemeReader;

public class BankAccountThreadRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETITIONS = 100;
        final int THREADS = 100;
        for (int i = 0; i < THREADS; i++) {
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
            Thread t1 = new Thread(d);
            Thread t2 = new Thread(w);
            t1.start();
            t2.start();
        }
    }
}
