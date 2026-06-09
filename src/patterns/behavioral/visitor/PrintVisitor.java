package patterns.behavioral.visitor;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("원, 반지름: " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("사각형, 너비: " + rectangle.getWidth() + ", 높이: " + rectangle.getHeight());
    }
}
