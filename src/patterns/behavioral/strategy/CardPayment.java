package patterns.behavioral.strategy;

public class CardPayment implements PaymentsStrategy {

    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 카드로 결제합니다.");
    }
}
