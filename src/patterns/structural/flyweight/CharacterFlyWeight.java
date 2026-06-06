package patterns.structural.flyweight;

public class CharacterFlyWeight {
    private char symbol;

    public CharacterFlyWeight(char symbol) {
        this.symbol = symbol;
        System.out.println(symbol + " 객체를 생성했습니다");
    }

    public void display(int x, int y) {
        System.out.println(symbol + "를 (" + x + ", " + y + ") 위치에 출력합니다");
    }
}
