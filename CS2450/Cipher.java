package CS2450;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cipher {
    private JTextField plainTextField;
    private JTextField cipherTextField;

    public Cipher() {
        JFrame frame = new JFrame("A simple code machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel plainTextLabel = new JLabel("Plain Text:");
        plainTextField = new JTextField(10);

        JLabel cipherTextLabel = new JLabel("Cipher Text:");
        cipherTextField = new JTextField(10);

        JButton encodeButton = new JButton("Encode");
        JButton decodeButton = new JButton("Decode");
        JButton resetButton = new JButton("Reset");

        encodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String plaintext = plainTextField.getText();
                String ciphertext = encode(plaintext);
                cipherTextField.setText(ciphertext);
            }
        });

        decodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ciphertext = cipherTextField.getText();
                String plaintext = decode(ciphertext);
                plainTextField.setText(plaintext);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plainTextField.setText("");
                cipherTextField.setText("");
            }
        });

        constraints.gridx = 1;
        constraints.gridy = 0;
        frame.add(plainTextLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        
        frame.add(plainTextField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        frame.add(cipherTextLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        frame.add(cipherTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        frame.add(encodeButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        frame.add(decodeButton, constraints);

        constraints.gridx = 2;
        constraints.gridy = 4;
        frame.add(resetButton, constraints);

        frame.setVisible(true);
    }

    private String encode(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + 1);
                if (Character.isLowerCase(c) && shifted > 'z' || Character.isUpperCase(c) && shifted > 'Z') {
                    shifted -= 26;
                }
                cipherText.append(shifted);
            } else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }

    
    private String decode(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - 1);
                if (Character.isLowerCase(c) && shifted < 'a' || Character.isUpperCase(c) && shifted < 'A') {
                    shifted += 26;
                }
                plainText.append(shifted);
            } else {
                plainText.append(c);
            }
        }
        return plainText.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Cipher::new);
    }
}
