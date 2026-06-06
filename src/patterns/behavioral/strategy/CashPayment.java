package patterns.behavioral.strategy;

public class CashPayment implements PaymentsStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 현금으로 결제합니다.");
    }
}
