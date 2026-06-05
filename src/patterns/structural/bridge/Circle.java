package patterns.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(color.fill() + " 원을 그립니다");
    }
}
