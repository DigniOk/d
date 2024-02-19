package java_development_kit_2.client;

import java_development_kit_2.server.Server;
import java_development_kit_2.client.ClientView;


public class Client {
    private ClientView clientView;
    private String name;
    private Server server;
    private boolean connected;

    public Client(ClientView clientView, Server server) {
        this.clientView = clientView;
        this.server = server;
    }

    public boolean connectToServer(String name){
        this.name = name;
        if (server.connectUser(this)){
            showOnWindow("Вы успешно подключились!\n");
            connected = true;
            String log = server.getHistory();
            if (log != null){
                showOnWindow(log);
            }
            return true;
        } else {
            showOnWindow("Подключение не удалось");
            return false;
        }
    }

    public boolean disconnectFromServer() {
        if (connected) {
            connected = false;
            server.disconnectUser(this);
        clientView.disconnectedFromServer();
            showOnWindow("Вы были отключены от сервера!");
            return true;
        }
        return false;
    }

    public void answerFromServer(String messageFromServer){
        showOnWindow(messageFromServer);
    }

    public void sendMessage(String message){
        if (connected) {
            if (!message.isEmpty()) {
                server.message(name + ": " + message);
            }
        } else {
            showOnWindow("Нет подключения к серверу");
        }
    }

    private void showOnWindow(String text) {
     clientView.sendMessage(text + "\n");
    }

    public String getUserName(){
        return name;
    }
}