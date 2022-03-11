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

    public void receivePayment(int coinCount, Coin coinType) {
        payment = payment + coinCount * coinType.getCoinValue();
    }

    public double giveChange() {
        double change = payment - purchase;
        payment = 0;
        purchase = 0;
        return change;
    }
}
