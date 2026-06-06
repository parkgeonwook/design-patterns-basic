package patterns.behavioral.state;

public class OpenState implements DoorState {
    @Override
    public void open(Door door) {
        System.out.println("문이 이미 열려있습니다.");
    }

    @Override
    public void close(Door door) {
        System.out.println("문을 닫습니다.");
        door.setState(new ClosedState());
    }
}
