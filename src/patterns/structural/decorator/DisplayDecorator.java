package patterns.structural.decorator;

public abstract class DisplayDecorator extends Display {
    protected Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }
}
