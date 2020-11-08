package Observer;

/**
 * https://victorydntmd.tistory.com/296?category=719467
 */
public class Client {
    public static void main(String args[]) {
        User user = new User();
        ChatRoom chatRoom = new ChatRoom("채팅방");
        GameRoom gameRoom = new GameRoom("채팅방");
        DevRoom devRoom = new DevRoom("채팅방");
        user.attach(chatRoom);
        user.attach(gameRoom);
        user.attach(devRoom);

        String msg = "안녕하세요~";
        user.notifyObservers(msg);

        user.detach(chatRoom);
        msg = "Hi~";
        user.notifyObservers(msg);
    }
}
