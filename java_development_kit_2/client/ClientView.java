package java_development_kit_2.client;

public interface ClientView {
    void sendMessage(String message);
    void connectedToServer();
    void disconnectedFromServer();
}
