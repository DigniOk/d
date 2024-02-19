package java_development_kit_2.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame implements ServerView{
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDHT = 400;
    private static final int WINDOW_POSX = 410;
    private static final int WINDOW_POSY = 300;

    private JButton btnOn, btnOff;
    private JTextArea log;
    private JPanel panBottom;
    private Server server;

    public ServerWindow() {
        settings();
        createMap();
        setVisible(true);
    }
    private void settings(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDHT, WINDOW_HEIGHT);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("ServerChat");
        server = new Server(this, new FileStorage());
    }

    private void createMap(){
        log = new JTextArea(21, 30);
        log.setEditable(false);
        add(log);
        add(createButtons(),BorderLayout.SOUTH);
    }
    private JPanel createButtons(){
        panBottom = new JPanel(new GridLayout(1,3));
        btnOn = new JButton("on");
        btnOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.serverPowerOn();
            }
        });
        btnOff = new JButton("off");
        btnOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.serverPowerOff();
            }
        });
        panBottom.add(btnOn);
        panBottom.add(btnOff);
        return panBottom;
    }
    @Override
    public void showMessage(String message){
        log.append(message + '\n');
    }

    public Server getConnection(){
        return server;
    }

}

