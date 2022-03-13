import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public ArrayList<BankAccount> readFile(String fileName) throws FileNotFoundException {
        int chanceLeft = 2;
        boolean isDone = false;
        while (chanceLeft > 0 && !isDone) {

            try (Scanner in = new Scanner(new File(fileName));) {
                while (in.hasNextLine()) {
                    int accountNumber = in.nextInt();
                    double initialBalance = in.nextDouble();
                    accounts.add(new BankAccount(accountNumber, initialBalance));
                }
                isDone = true;

            } catch (InputMismatchException e) {
                chanceLeft--;
                System.out.print("Wrong data format. Another chance to choose file : ");
                Scanner input = new Scanner(System.in);
                fileName = input.next();
            }
        }
        return accounts;
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
