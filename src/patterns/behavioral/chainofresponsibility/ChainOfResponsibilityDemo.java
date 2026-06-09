package patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Handler lowLevelHandler = new LowLevelHandler();
        Handler midLevelHandler = new MidLevelHandler();
        Handler highLevelHandler = new HighLevelHandler();

        lowLevelHandler.setHandler(midLevelHandler);
        midLevelHandler.setHandler(highLevelHandler);

        lowLevelHandler.handle(5);
        lowLevelHandler.handle(15);
        lowLevelHandler.handle(25);
        lowLevelHandler.handle(35);
    }
}
