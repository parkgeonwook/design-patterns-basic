package patterns.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();
        smartHomeFacade.startEveningMode();
    }
}
