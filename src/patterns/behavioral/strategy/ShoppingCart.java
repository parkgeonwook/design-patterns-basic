package patterns.behavioral.strategy;

public class ShoppingCart {
    private PaymentsStrategy paymentsStrategy;

    public void setPaymentsStrategy(PaymentsStrategy paymentsStrategy) {
        this.paymentsStrategy = paymentsStrategy;
    }

    public void checkout(int amount) {
        paymentsStrategy.pay(amount);
    }
}
