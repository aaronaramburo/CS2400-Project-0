import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1, 10, 10));

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);  // Initial value

        JLabel label = new JLabel("Current Percentage: ", SwingConstants.CENTER);
        JButton buttonA = new JButton("Press Me!");
        JButton buttonB = new JButton("Reset");

        buttonB.setEnabled(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonA);
        buttonPanel.add(buttonB);

        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int progress = progressBar.getValue(); // Get current value
                if (progress < 100) {
                    progress += 10;
                    progressBar.setValue(progress); // Update progress bar
                    label.setText("Current Percentage: " + progress ); // Update label
                }
                if (progress >= 100) {
                    buttonA.setEnabled(false); // Disable Button A
                    buttonB.setEnabled(true); // Enable Button B
                }
            }
        });

        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(0);
                label.setText("Current Percentage: ");
                buttonA.setEnabled(true); // Enable Button A
                buttonB.setEnabled(false); // Disable Button B
            }
        });

        frame.add(progressBar);
        frame.add(label);
        frame.add(buttonPanel);

        frame.setVisible(true);
    }
}
