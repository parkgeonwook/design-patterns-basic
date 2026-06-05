package patterns.structural.facade;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private MusicPlayer musicPlayer;

    public SmartHomeFacade() {
        this.light = new Light();
        this.airConditioner = new AirConditioner();
        this.musicPlayer = new MusicPlayer();
    }

    public void startEveningMode() {
        light.on();
        airConditioner.on();
        musicPlayer.on();
    }
}
