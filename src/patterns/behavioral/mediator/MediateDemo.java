package patterns.behavioral.mediator;

public class MediateDemo {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("철수", chatRoom);
        User user2 = new User("영희", chatRoom);
        User user3 = new User("민수", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("안녕. 난 철수야.");
    }
}
