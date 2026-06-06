package patterns.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentsStrategy(new CardPayment());
        cart.checkout(10000);

        cart.setPaymentsStrategy(new CashPayment());
        cart.checkout(5000);
    }
}
