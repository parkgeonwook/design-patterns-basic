package patterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        User user = new User.MyBuilder()
                .name("Kim")
                .age(20)
                .address("Suwon")
                .phone("010-1234-5678")
                .build();

        user.showInfo();
    }
}
