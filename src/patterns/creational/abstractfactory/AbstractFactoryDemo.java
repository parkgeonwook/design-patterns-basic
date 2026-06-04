package patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        FurnitureFactory factory = new ClassicFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        table.use();
    }
}
