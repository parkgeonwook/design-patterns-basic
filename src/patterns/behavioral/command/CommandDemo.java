package patterns.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(command);
        remoteControl.pressButton();
    }
}
