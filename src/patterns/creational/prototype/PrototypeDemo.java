package patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Circle original = new Circle("red", 10);
        Circle copy = original.clone();

        copy.setColor("blue");

        original.showInfo();
        copy.showInfo();
    }
}
