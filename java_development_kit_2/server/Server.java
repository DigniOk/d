package java_development_kit_2.server;

import java_development_kit_2.client.Client;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private boolean isOn;
    private List<Client> clientList;
    private ServerView serverView;
    private ServerRepository serverRepository;
    public Server(ServerView serverView, ServerRepository serverRepository){
        clientList = new ArrayList<>();
        this.serverView = serverView;
        this.serverRepository = serverRepository;
        isOn = false;
    }
    public boolean connectUser(Client client){
        if (!isOn){
            return false;
        }
        showMessage(client.getUserName() + " подключился к серверу");
        clientList.add(client);
        return true;
    }


    public void disconnectUser(Client client){
        clientList.remove(client);
        if (client != null){
            if (client.disconnectFromServer())
                showMessage(client.getUserName() + " отключен от сервера!");
        }
    }

    public void message(String message){
        if (!isOn){
            return;
        }
        showMessage(message);
        answerAll(message);
        completeHistory(message);
    }
    public void answerAll(String text){
        for (Client client: clientList){
            client.answerFromServer(text);
        }
    }

    public void showMessage(String message){
        serverView.showMessage(message);
    }

    public void completeHistory(String message){
        serverRepository.completeHistory(message);
    }
    public String getHistory(){
        return serverRepository.getHistory();
    }

    public void serverPowerOn(){
        if (isOn) {
            showMessage("Сервер уже был запущен");
        } else {
            isOn = true;
            showMessage("Сервер запущен!");
        }
    }
    public void serverPowerOff(){
        if (isOn) {
            isOn = false;
            for (Client client: clientList){
                disconnectUser(client);
            }
            showMessage("Сервер остановлен!");
        } else{
            showMessage("Сервер уже был остановлен");
        }
    }


}

    

