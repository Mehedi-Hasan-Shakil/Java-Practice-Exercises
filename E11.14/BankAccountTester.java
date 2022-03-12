/*Modify the BankAccount class to throw an IllegalArgumentException when the account is
  constructed with a negative balance, when a negative amount is deposited, or when
  an amount that is not between 0 and the current balance is withdrawn. Write a test
  program that causes all three exceptions to occur and that catches them all.
*/

public class BankAccountTester {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(-100);
            account.deposit(100);
            account.withdraw(101);
        } catch (IllegalInitialBalanceException e) {
            System.out.println(e);
        } catch (IllegalDepositException e) {
            System.out.println(e);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }

    }
}
