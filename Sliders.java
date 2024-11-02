import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sliders {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);
        frame.setLayout(new BorderLayout());

        JPanel slidersPanel = new JPanel(new GridLayout(1, 2, 10, 10)); // Sliders side by side

        JSlider hSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        hSlider.setMajorTickSpacing(10);
        hSlider.setMinorTickSpacing(5);
        hSlider.setPaintTicks(true);
        hSlider.setPaintLabels(true);
        hSlider.setInverted(true);

        JSlider vSlider = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        vSlider.setMajorTickSpacing(10);
        vSlider.setMinorTickSpacing(5);
        vSlider.setPaintTicks(true);
        vSlider.setPaintLabels(true);

        slidersPanel.add(hSlider);
        slidersPanel.add(vSlider);

        JPanel labelsPanel = new JPanel(new GridLayout(2, 1, 0, 5)); // Two labels stacked vertically
        JLabel hLabel = new JLabel("Horizontal Value: ", SwingConstants.CENTER);
        JLabel vLabel = new JLabel("Vertical Value: ", SwingConstants.CENTER);

        labelsPanel.add(hLabel);
        labelsPanel.add(vLabel);

        hSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                int currentHVal = hSlider.getValue();
                hLabel.setText("Horizontal Value: " + currentHVal);
            }
        });

        vSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                int currentVVal = vSlider.getValue();
                vLabel.setText("Vertical Value: " + currentVVal);
            }
        });

        frame.add(slidersPanel, BorderLayout.CENTER);
        frame.add(labelsPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
