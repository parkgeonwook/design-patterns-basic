package patterns.behavioral.templatemethod;

public class Coffee extends Beverage {
    @Override
    protected void addIngredient() {
        System.out.println("커피 가루를 넣습니다.");
    }
}
