package patterns.structural.decorator;

public class BracketDecorator extends DisplayDecorator{
    public BracketDecorator(Display display) {
        super(display);
    }

    @Override
    public String getText() {
        return "[" + display.getText() + "]";
    }
}
