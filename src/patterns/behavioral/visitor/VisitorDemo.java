package patterns.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6)
        };

        Visitor visitor = new PrintVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
