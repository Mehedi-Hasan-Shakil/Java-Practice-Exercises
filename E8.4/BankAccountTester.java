public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        BankAccount account1 = account.withdraw(50);
        BankAccount account2 = account.deposit(50);
        System.out.println(account.getBalance());
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account.getBalance());
    }
}
