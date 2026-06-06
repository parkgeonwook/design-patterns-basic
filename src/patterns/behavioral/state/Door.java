package patterns.behavioral.state;

public class Door {
    private DoorState state;

    public Door() {
        this.state = new ClosedState();
    }

    public void setState(DoorState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }
}
