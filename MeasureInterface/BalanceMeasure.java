public class BalanceMeasure implements Measurable {

    @Override
    public double measure(Object object) {
        BankAccount account = (BankAccount) object;
        return  account.getBalance();
    }
}
