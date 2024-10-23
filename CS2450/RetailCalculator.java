package CS2450;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class RetailCalculator extends JFrame {
    
    private JTextField wholesaleTextField;
    private JTextField markupTextField;
    private JLabel resultLabel;

    public RetailCalculator() {
        
        JLabel wholesaleLabel = new JLabel(" Wholesale Cost (in $):");
        wholesaleTextField = new JTextField(10);
        
        JLabel markupLabel = new JLabel(" Markup Percentage (%):");
        markupTextField = new JTextField(10);
        
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Retail Price: $-");

        setLayout(new GridLayout(3, 2, 10, 10));
        add(wholesaleLabel);
        add(wholesaleTextField);
        add(markupLabel);
        add(markupTextField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateRetailPrice();
            }
        });

        setTitle("Retail Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void calculateRetailPrice() {
        try {

            double wholesaleCost = Double.parseDouble(wholesaleTextField.getText());
            double markupPercent = Double.parseDouble(markupTextField.getText());

            double retailPrice = wholesaleCost + (wholesaleCost * (markupPercent / 100));

            resultLabel.setText(String.format("Retail Price: $%.2f", retailPrice));
        } catch (NumberFormatException e) {
            resultLabel.setText("Enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new RetailCalculator();
    }
}
