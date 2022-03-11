public class CashRegisterTester {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");
        final Coin DIME = new Coin(0.10, "Dime");
        final Coin NICKEL = new Coin(0.05, "Nickel");
        final Coin PENNY = new Coin(0.01, "Penny");

        CashRegister register = new CashRegister();

        register.recordPurchase(2);

        register.receivePayment(2, DOLLAR);
        register.receivePayment(1, DIME);
        System.out.println("Change: ");
        System.out.println("Dollar : " + register.giveChange(DOLLAR));
        System.out.println("Quarter : " + register.giveChange(QUARTER));
        System.out.println("Dime : " + register.giveChange(DIME));
        System.out.println("Nickel : " + register.giveChange(NICKEL));
        System.out.println("Penny : " + register.giveChange(PENNY));

    }
}
