import javax.swing.*;
import java.awt.*;

public class SplitPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Split Pane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout());
        JLabel left = new JLabel("This label is stored on the");
        JLabel left2 = new JLabel("left side of the split pane");
        JButton redButton = new JButton("Red");
        JButton blueButton = new JButton("Blue");
        JButton greenButton = new JButton("Green");

        leftPanel.add(left);
        leftPanel.add(left2);
        leftPanel.add(redButton);
        leftPanel.add(blueButton);
        leftPanel.add(greenButton);

        JPanel rightPanel = new JPanel();
        JLabel right = new JLabel("This label is stored on the right side of the split pane");
        rightPanel.add(right);

        redButton.addActionListener(e -> rightPanel.setBackground(Color.RED));
        blueButton.addActionListener(e -> rightPanel.setBackground(Color.BLUE));
        greenButton.addActionListener(e -> rightPanel.setBackground(Color.GREEN));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(200);
        
        frame.add(splitPane);
        frame.setVisible(true);
    }
}
