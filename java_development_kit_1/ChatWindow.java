package java_development_kit_1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatWindow extends JFrame {

    private int WINDOW_POS_X = 700;
    private int WINDOW_POS_Y = 300;
    private int WINDOW_WIDTH = 500;
    private int WINDOW_HEIGHT = 400;
    private String WINDOW_TITLE = "Чат, сервер: ";
    
    private String login;
    private String server;
    private LogHandler logHandler;
    private String msgText = "";
    private JButton sendButton = new JButton("Отправить");
    private JLabel inputLabel = new JLabel("Введите сообщение");
    private JTextField inputField = new JTextField();
    private JTextArea outputField = new JTextArea();
    private JPanel mainGrid = new JPanel(new GridLayout(2,1));
    private JPanel inputGrid = new JPanel(new GridLayout(1,1));

    ChatWindow(String login, String server, LogHandler logHandler) throws IOException{
        this.logHandler = logHandler;
        this.login = login;
        this.server = server;
        WINDOW_TITLE =  WINDOW_TITLE + server;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_TITLE);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        initWindow();

        inputGrid.add(outputField);
        inputGrid.add(inputLabel);
        inputGrid.add(inputField);
        mainGrid.add(inputGrid);
        mainGrid.add(sendButton);
        add(mainGrid);
        setVisible(true);
    }
    
    private void initWindow() throws IOException{
        outputField.enableInputMethods(false);
        outputField.setBackground(Color.LIGHT_GRAY);


        StringBuilder builder = new StringBuilder();
        for (String string : logHandler.Read()) {
            builder.append(string);
            builder.append("\n");
        }
        outputField.setText(builder.toString());

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss")).toString();
                String msgText = dt + " " + login + ": " + inputField.getText();
                try {
                    logHandler.Write(msgText);
                    outputField.append(msgText);
                    outputField.append("\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                inputField.setText("");
            }
        });
        inputField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss")).toString();
                    String msgText = dt + " " + login + ": " + inputField.getText();
                    try {
                        logHandler.Write(msgText);
                        outputField.append(msgText);
                        outputField.append("\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    inputField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

    }
    
}
