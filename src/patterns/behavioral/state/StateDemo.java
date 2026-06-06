package patterns.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        Door door = new Door();

        door.close();
        door.open();
        door.open();
        door.close();
    }
}
