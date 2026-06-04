package patterns.creational.factorymethod;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}
