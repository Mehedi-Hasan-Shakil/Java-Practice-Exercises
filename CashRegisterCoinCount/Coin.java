public class Coin {
    private double coinValue;
    private String coinName;

    public Coin(double aValue, String aName) {
        coinValue = aValue;
        coinName = aName;
    }

    public double getCoinValue() {
        return coinValue;
    }
}
