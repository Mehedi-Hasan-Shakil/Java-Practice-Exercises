public class CashRegister {
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

    public int giveChange(Coin coinType) {
        double change = payment - purchase;
        int numberOfCoins = (int) (change / coinType.getCoinValue());
        payment = payment - (numberOfCoins * coinType.getCoinValue());
        return numberOfCoins;
    }
}
