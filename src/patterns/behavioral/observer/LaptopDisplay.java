package patterns.behavioral.observer;

public class LaptopDisplay implements Observer{

    @Override
    public void update(int temperature) {
        System.out.println("노트북 화면: 현재 온도는 " + temperature + "도입니다.");
    }
}
