public class CashRegister {
    private final double QUARTER_VALUE = .25;
    private final double DIME_VALUE = .1;
    private final double NICKEL_VALUE = .05;
    private final double PENNY_VALUE = .01;
    private double purchase;
    private double payment;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int penny) {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + penny * PENNY_VALUE;
    }

    public double giveChange() {
        double change = payment - purchase;
        payment = 0;
        purchase = 0;
        return change;
    }
}
