package patterns.structural.decorator;

public class SimpleDisplay extends Display {
    private String text;

    public SimpleDisplay(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
