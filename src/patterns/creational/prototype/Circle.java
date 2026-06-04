package patterns.creational.prototype;

public class Circle implements Cloneable {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        System.out.println("색상: " + color + ", 반지름: " + radius);
    }


    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
