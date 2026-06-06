package patterns.behavioral.templatemethod;

public abstract class Beverage {
    public final void prepare() {
        boilWater();
        addIngredient();
        pourInCup();
    }

    private void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    private void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }

    protected abstract void addIngredient();
}
