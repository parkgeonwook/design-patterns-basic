package patterns.behavioral.templatemethod;

public class Tea extends Beverage {
    @Override
    protected void addIngredient() {
        System.out.println("티백을 넣습니다.");
    }
}
