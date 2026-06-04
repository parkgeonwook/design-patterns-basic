package patterns.structural.adapter;

public class Banner {
    private String message;

    public Banner(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
}
