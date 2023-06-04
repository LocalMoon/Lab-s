package mypackage;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTextArea;

public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout());
        JPanel panel = new JPanel();
        //JTextArea panel = new JTextArea();
        //Hero hero = new Hero(panel);

        frame.add(panel);
        frame.setVisible(true);

        Ball ball1 = new Ball(panel, 2, 50, 200, 40);
        Ball ball2 = new Ball(panel, 10, 10, 100, 50);
        Ball ball3 = new Ball(panel, 5, 20, 30, 30);

        ball1.start();
        ball2.start();
        ball3.start();
        //hero.start();
    }
}
