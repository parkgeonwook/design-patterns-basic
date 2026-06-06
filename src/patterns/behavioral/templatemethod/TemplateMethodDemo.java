package patterns.behavioral.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("[커피 준비]");
        coffee.prepare();

        System.out.println();

        System.out.println("[차 준비]");
        tea.prepare();
    }
}
