import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Character Quotes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        ImageIcon crying = new ImageIcon(test.class.getResource("crying.jpeg"));
        ImageIcon happy = new ImageIcon(test.class.getResource("happy.jpg"));
        ImageIcon thumbsUp = new ImageIcon(test.class.getResource("thumbsup.jpg"));
       
        JLabel label = new JLabel("Select a character for their quote!");
        frame.add(label);
        
        JButton cryingButton = new JButton(crying);
        cryingButton.setText("Crying");
        frame.add(cryingButton);

        JButton happyButton = new JButton(happy);
        happyButton.setText("Happy");
        frame.add(happyButton);

        JButton thumbsUpButton = new JButton(thumbsUp);
        thumbsUpButton.setText("Thumbs Up!");
        frame.add(thumbsUpButton);

        // Add action listeners for each button
        cryingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Quote for Crying: \"WAAAAAH\"");
            }
        });

        happyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Quote for Happy: \"yaaaaay\"");
            }
        });

        thumbsUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Quote for Thumbs Up: \"noice.\"");
            }
        });

        frame.setVisible(true);
    }
}
