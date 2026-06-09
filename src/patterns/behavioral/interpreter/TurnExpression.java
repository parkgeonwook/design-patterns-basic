package patterns.behavioral.interpreter;

public class TurnExpression implements Expression {
    private String direction;

    public TurnExpression(String direction) {
        this.direction = direction;
    }

    @Override
    public void interpret() {
        System.out.println(direction + "쪽으로 회전합니다.");
    }
}
