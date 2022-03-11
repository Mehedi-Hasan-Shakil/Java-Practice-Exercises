import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<BankAccount> accounts = readFile();
        BankAccount largestAccount = accounts.get(0);
        for (BankAccount account : accounts) {
            if (account.getBalance() > largestAccount.getBalance()) {
                largestAccount = account;
            }
        }
        System.out.println("Account : " + largestAccount.getAccountNumber());
        System.out.println("Balance : " + largestAccount.getBalance());
    }

    static ArrayList<BankAccount> readFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        ArrayList<BankAccount> accounts = new ArrayList<>();
        while (in.hasNextLine()) {
            accounts.add(new BankAccount(in.nextInt(), in.nextDouble()));
        }
        return accounts;
    }
}
