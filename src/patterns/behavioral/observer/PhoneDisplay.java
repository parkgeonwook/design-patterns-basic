package patterns.behavioral.observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("휴대폰 화면: 현재 온도는 " + temperature + "도입니다.");
    }
}
