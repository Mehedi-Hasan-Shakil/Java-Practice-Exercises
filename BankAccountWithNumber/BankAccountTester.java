import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Bank bank = new Bank();
        ArrayList<BankAccount> accounts = bank.readFile(in.next());
        System.out.println("Largest account balance is : " + bank.largestAccount(accounts).getBalance());
    }
}
