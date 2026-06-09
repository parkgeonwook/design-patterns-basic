package patterns.behavioral.interpreter;

public class MoveExpression implements Expression{
    private int distance;

    public MoveExpression(int distance) {
        this.distance = distance;
    }

    @Override
    public void interpret() {
        System.out.println(distance + "칸 이동합니다.");
    }
}
