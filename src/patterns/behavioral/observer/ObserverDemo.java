package patterns.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObserver(new PhoneDisplay());
        weatherStation.addObserver(new LaptopDisplay());

        weatherStation.setTemperature(25);
        System.out.println();
        weatherStation.setTemperature(30);
    }
}
