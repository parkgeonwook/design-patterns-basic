package patterns.behavioral.mediator;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void send(String message) {
        System.out.println(name + ": " + message);
        chatRoom.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name +"님이 메시지를 받았습니다: " + message);
    }
}
