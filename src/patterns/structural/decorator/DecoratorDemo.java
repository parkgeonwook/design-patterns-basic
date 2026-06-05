package patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        SimpleDisplay simpleDisplay = new SimpleDisplay("hello");
        BracketDecorator decorated = new BracketDecorator(simpleDisplay);

        System.out.println(simpleDisplay.getText());
        System.out.println(decorated.getText());
    }
}
