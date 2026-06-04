package patterns.structural.adapter;

public class PrintAdapter implements Print {

    private Banner banner;

    public PrintAdapter(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void print() {
        banner.showMessage();
    }
}
