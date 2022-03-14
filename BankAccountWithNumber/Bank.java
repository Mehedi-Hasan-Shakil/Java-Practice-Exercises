import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    int chanceLeft = 1;
    boolean isDone = false;

    public ArrayList<BankAccount> readFile(String fileName) throws FileNotFoundException {
        try (Scanner in = new Scanner(new File(fileName))) {
            read(in);
            return accounts;
        }
    }

    public void read(Scanner in) throws FileNotFoundException {
        while (!isDone && chanceLeft > 0) {
            try {
                while (in.hasNextLine()) {
                    accounts.add(new BankAccount(in.nextInt(), in.nextDouble()));
                }
                isDone = true;
            } catch (InputMismatchException e) {
                chanceLeft--;
                accounts.clear();
                System.out.print("Data is not properly formatted. Enter another file name : ");
                Scanner input = new Scanner(System.in);
                readFile(input.next());
            }
        }
    }

    public BankAccount largestAccount(ArrayList<BankAccount> accounts) {
        BankAccount largestAccount = accounts.get(0);
        for (BankAccount account : accounts) {
            if (account.getBalance() > largestAccount.getBalance()) {
                largestAccount = account;
            }
        }
        return largestAccount;
    }
}
