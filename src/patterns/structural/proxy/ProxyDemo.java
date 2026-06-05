package patterns.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("photo.png");

        System.out.println("이미지 객체는 생성했지만 아직 출력하지 않았습니다");
        System.out.println();

        image.display();
        System.out.println();

        image.display();
    }
}
