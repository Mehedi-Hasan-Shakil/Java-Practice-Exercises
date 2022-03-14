public class CustomerTester {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.makePurchase(100);
        System.out.println("Is discount : " + customer.discountReached());
        customer.makePurchase(20);
        customer.useDiscount();
        System.out.println(customer.getTotalPurchase());
        customer.makePurchase(50);
        System.out.println("Is discount : " + customer.discountReached());
        customer.makePurchase(60);
        System.out.println("Is discount : " + customer.discountReached());
        customer.useDiscount();
        System.out.println(customer.getTotalPurchase());
    }
}