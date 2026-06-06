package patterns.structural.flyweight;

public class FlyWeightDemo {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        CharacterFlyWeight a1 = factory.getCharacter('A');
        CharacterFlyWeight a2 = factory.getCharacter('A');
        CharacterFlyWeight b1 = factory.getCharacter('B');

        a1.display(1,1);
        a1.display(2,3);
        b1.display(4, 5);

        System.out.println(a1 == a2);
    }
}
