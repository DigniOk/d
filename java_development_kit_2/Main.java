package java_development_kit_2;

import java_development_kit_2.client.Client;
import java_development_kit_2.client.ClientGUI;
import java_development_kit_2.server.Server;
import java_development_kit_2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
