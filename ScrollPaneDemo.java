import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Pane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        JButton headerButton = new JButton("Header Button!");
        frame.add(headerButton, BorderLayout.NORTH);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        ImageIcon imageIcon = new ImageIcon(ScrollPaneDemo.class.getResource("crying.jpeg"));
        JLabel imageLabel = new JLabel(imageIcon);
        contentPanel.add(imageLabel);

        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("scroll"));
        contentPanel.add(new JLabel("hi :)"));

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

