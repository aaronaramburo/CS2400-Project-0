package CS2450;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));

        JLabel label1 = new JLabel("Top Left", JLabel.LEFT);
        label1.setVerticalAlignment(JLabel.TOP);
        JLabel label2 = new JLabel("Top Center", JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.TOP);
        JLabel label3 = new JLabel("Top Right", JLabel.RIGHT);
        label3.setVerticalAlignment(JLabel.TOP);
        JLabel label4 = new JLabel("Center Left", JLabel.LEFT);
        label4.setVerticalAlignment(JLabel.CENTER);
        JLabel label5 = new JLabel("Center Center", JLabel.CENTER);
        label5.setVerticalAlignment(JLabel.CENTER);
        JLabel label6 = new JLabel("Center Right", JLabel.RIGHT);
        label6.setVerticalAlignment(JLabel.CENTER);
        JLabel label7 = new JLabel("Bottom Left", JLabel.LEFT);
        label7.setVerticalAlignment(JLabel.BOTTOM);
        JLabel label8 = new JLabel("Bottom Center", JLabel.CENTER);
        label8.setVerticalAlignment(JLabel.BOTTOM);
        JLabel label9 = new JLabel("Bottom Right", JLabel.RIGHT);
        label9.setVerticalAlignment(JLabel.BOTTOM);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.setVisible(true);
    }
}