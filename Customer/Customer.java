public class Customer {
    private int discount;
    private double totalPurchase;

    public Customer() {
        totalPurchase = 0;
        discount = 0;
    }

    public void makePurchase(double amount) {
        totalPurchase += amount;
    }

    public boolean discountReached() {
        if (totalPurchase >= 100) {
            discount++;
            return true;
        } else
            return false;
    }

    public void useDiscount() {
        if (discount > 0)
            totalPurchase -= 100;
        if (totalPurchase >= 10) {
            totalPurchase -= 10;
            discount--;
        }
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }
}
