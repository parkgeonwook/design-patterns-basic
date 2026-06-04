package patterns.creational.builder;

public class User {
    private String name;
    private int age;
    private String address;
    private String phone;

    private User(MyBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("전화번호: " + phone);
    }

    public static class MyBuilder {
        private String name;
        private int age;
        private String address;
        private String phone;

        public MyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public MyBuilder age(int age) {
            this.age = age;
            return this;
        }

        public MyBuilder address(String address) {
            this.address = address;
            return this;
        }

        public MyBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
