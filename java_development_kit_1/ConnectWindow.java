package java_development_kit_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConnectWindow extends JFrame {

    private int WINDOW_HEIGHT = 300;
    private int WINDOW_WIDTH = 350;
    private int WINDOW_POS_X = 800;
    private int WINDOW_POS_Y = 400;
    private String WINDOW_TITLE = "Подключение к серверу";
    private LogHandler logHandler;

    JLabel loginLabel = new JLabel("Введите ваш логин:");
    JTextField loginField = new JTextField();
    JLabel passwordLabel = new JLabel("Введите ваш пароль:");
    JTextField passwordField = new JTextField();
    JLabel serverLabel = new JLabel("Введите адрес сервера:");
    JTextField serverField = new JTextField();
    JButton buttonConnect = new JButton("Подключиться");

    JPanel mainGrid = new JPanel(new GridLayout(4,1));
    JPanel loginGrid = new JPanel(new GridLayout(1,2));
    JPanel passwordGrid = new JPanel(new GridLayout(1,2));
    JPanel serverGrid = new JPanel(new GridLayout(1,2));
    ConnectWindow(LogHandler logHandler){
        this.logHandler = logHandler;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_TITLE);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        loginGrid.add(loginLabel);
        loginGrid.add(loginField);
        passwordGrid.add(passwordLabel);
        passwordGrid.add(passwordField);
        serverGrid.add(serverLabel);
        serverGrid.add(serverField);
        mainGrid.add(loginGrid);
        mainGrid.add(passwordGrid);
        mainGrid.add(serverGrid);
        mainGrid.add(buttonConnect);
        add(mainGrid);
        initWindow();
        setVisible(true);
    }

    private void initWindow(){
        buttonConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String login = loginField.getText();
                String server = serverField.getText();
                try {
                    new ChatWindow(login, server, logHandler);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                setVisible(false);
            }
        });

    }

    
}
