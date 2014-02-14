package sandesh.chat;


public interface SocketServerObserver {
    void onNewConnection(MessageClient messageClient);

    void onError(Exception e);
}
