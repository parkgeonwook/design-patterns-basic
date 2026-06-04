package patterns.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        Banner banner = new Banner("안녕하세요");
        Print print = new PrintAdapter(banner);
        print.print();
    }
}
