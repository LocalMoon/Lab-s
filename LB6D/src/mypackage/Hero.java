package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Thread {
    private final int UP = 38;
    private final int DOWN = 40;
    private final int LEFT = 37;
    private final int RIGHT = 39;

    private JTextArea panel; 
    private Graphics gr;
    
    int step = 5; int x = 20; int y = 120;
    
    public Hero(JTextArea panel) {
        this.panel = panel;
    }

    private void moveup() { y += step;}
    private void movedown() {y -= step;}
    private void moveleft() {x += step;}
    private void moveright() {x -= step;}

    @Override
    public void run() { 
        gr = panel.getGraphics();
        gr.setColor(Color.BLUE);
        gr.fillRect(x, y, 20, 20);

        panel.addKeyListener(new KeyListener() {

            public void keyPressed(KeyEvent event) {
                gr.setColor(Color.CYAN);
                gr.fillRect(x, y, 20, 20);

                switch (event.getKeyCode()) {
                    case UP: moveup(); break;
                    case DOWN: movedown(); break;
                    case LEFT: moveleft(); break;
                    case RIGHT: moveright(); break;
                }

                gr.setColor(Color.BLUE);
                gr.fillRect(x, y, 20, 20);
            }
            public void keyTyped(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0){
            }
        });
    }
}
