import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) throws FileNotFoundException {
        Bank bank = new Bank();
        Scanner in = new Scanner(System.in);
        String fileName = in.next();
        ArrayList<BankAccount> accounts = bank.readFile(fileName);
        System.out.println(bank.largestAccount(accounts).getBalance());
    }
}
