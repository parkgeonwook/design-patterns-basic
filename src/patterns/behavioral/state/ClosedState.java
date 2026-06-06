package patterns.behavioral.state;

public class ClosedState implements DoorState {
    @Override
    public void open(Door door) {
        System.out.println("문을 엽니다");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("문이 이미 닫혀있습니다.");
    }
}
