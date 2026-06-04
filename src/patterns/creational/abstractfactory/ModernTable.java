package patterns.creational.abstractfactory;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("모던 테이블 사용");
    }
}
