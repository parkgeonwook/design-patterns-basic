package patterns.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(color.fill() + " 사각형을 그립니다.");
    }
}
