package patterns.creational.abstractfactory;

public class ClassicTable implements Table {
    @Override
    public void use() {
        System.out.println("클래식 테이블 사용");
    }
}
