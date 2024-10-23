package CS2450;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class JoesAutomotive extends JFrame {
    
    private JCheckBox oilChangeCheckBox, lubeJobCheckBox, radiatorFlushCheckBox, 
                      transmissionFlushCheckBox, inspectionCheckBox, 
                      mufflerReplacementCheckBox, tireRotationCheckBox;
    
    private JTextField partsField, laborField;
    private JLabel totalLabel;

    private final double OIL_CHANGE_PRICE = 36.00;
    private final double LUBE_JOB_PRICE = 18.00;
    private final double RADIATOR_FLUSH_PRICE = 30.00;
    private final double TRANSMISSION_FLUSH_PRICE = 80.00;
    private final double INSPECTION_PRICE = 15.00;
    private final double MUFFLER_REPLACEMENT_PRICE = 100.00;
    private final double TIRE_ROTATION_PRICE = 20.00;
    private final double LABOR_RATE = 20.00;

    public JoesAutomotive() {
        oilChangeCheckBox = new JCheckBox("Oil Change ($36.00)");
        lubeJobCheckBox = new JCheckBox("Lube Job ($18.00)");
        radiatorFlushCheckBox = new JCheckBox("Radiator Flush ($30.00)");
        transmissionFlushCheckBox = new JCheckBox("Transmission Flush ($80.00)");
        inspectionCheckBox = new JCheckBox("Inspection ($15.00)");
        mufflerReplacementCheckBox = new JCheckBox("Muffler Replacement ($100.00)");
        tireRotationCheckBox = new JCheckBox("Tire Rotation ($20.00)");

        
        JLabel emptyJLabel = new JLabel("");//empty label just to organize grid

        JLabel partsLabel = new JLabel("Parts Cost ($):");
        partsField = new JTextField(10);
        
        JLabel laborLabel = new JLabel("Labor Hours ($20/hr):");
        laborField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Total");
        totalLabel = new JLabel("Total Cost: $0.00");

        setLayout(new GridLayout(7, 2, 10, 10));
        add(oilChangeCheckBox);
        add(lubeJobCheckBox);
        add(radiatorFlushCheckBox);
        add(transmissionFlushCheckBox);
        add(inspectionCheckBox);
        add(mufflerReplacementCheckBox);
        add(tireRotationCheckBox);
        add(emptyJLabel);
        add(partsLabel);
        add(partsField);
        add(laborLabel);
        add(laborField);
        add(calculateButton);
        add(totalLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });

        setTitle("Joe's Automotive");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void calculateTotal() {
        double total = 0.0;

        if (oilChangeCheckBox.isSelected()) total += OIL_CHANGE_PRICE;
        if (lubeJobCheckBox.isSelected()) total += LUBE_JOB_PRICE;
        if (radiatorFlushCheckBox.isSelected()) total += RADIATOR_FLUSH_PRICE;
        if (transmissionFlushCheckBox.isSelected()) total += TRANSMISSION_FLUSH_PRICE;
        if (inspectionCheckBox.isSelected()) total += INSPECTION_PRICE;
        if (mufflerReplacementCheckBox.isSelected()) total += MUFFLER_REPLACEMENT_PRICE;
        if (tireRotationCheckBox.isSelected()) total += TIRE_ROTATION_PRICE;

        try {
            double partsCost = Double.parseDouble(partsField.getText());
            total += partsCost;
        } catch (NumberFormatException e) {
            partsField.setText("$0.00");
        }

        try {
            double laborHours = Double.parseDouble(laborField.getText());
            total += laborHours * LABOR_RATE;
        } catch (NumberFormatException e) {
            laborField.setText("0");
        }

        totalLabel.setText(String.format("Total Cost: $%.2f", total));
    }

    public static void main(String[] args) {
        new JoesAutomotive();
    }
}
