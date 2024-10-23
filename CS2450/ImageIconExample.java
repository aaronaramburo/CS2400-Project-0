package CS2450;
import javax.swing.*;
import java.awt.*;

public class ImageIconExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ImageIcon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout()); // 5 rows, 1 column layout for simplicity

        ImageIcon icon = new ImageIcon(ImageIconExample.class.getResource("crying.jpeg"));
        

        JLabel labelWithImageOnly = new JLabel(icon);
        frame.add(labelWithImageOnly);
        JLabel labelWithImageAndText = new JLabel("cryin", icon, JLabel.CENTER);
        frame.add(labelWithImageAndText);
        JLabel labelTextLeftOfImage = new JLabel("cryin", icon, JLabel.LEFT);
        labelTextLeftOfImage.setHorizontalTextPosition(JLabel.LEFT); // Text on the left of the image
        frame.add(labelTextLeftOfImage);
        JLabel labelTextTopOfImage = new JLabel("cryin", icon, JLabel.CENTER);
        labelTextTopOfImage.setVerticalTextPosition(JLabel.TOP); // Text on top of the image
        labelTextTopOfImage.setHorizontalTextPosition(JLabel.CENTER); // Image centered under the text
        frame.add(labelTextTopOfImage);
        JButton buttonWithImage = new JButton(icon);
        buttonWithImage.setText("cryin");
        frame.add(buttonWithImage);
        frame.setVisible(true);
    }
}