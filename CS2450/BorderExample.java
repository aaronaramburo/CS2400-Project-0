package CS2450;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BorderExample extends JFrame {

    public BorderExample(){
        setTitle("Borders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel simpleBorder = new JLabel("Simple Border");
        simpleBorder.setBorder(BorderFactory.createLineBorder(Color.RED));
        add(simpleBorder);

        JLabel etchedBorder = new JLabel("Etched Border");
        etchedBorder.setBorder(BorderFactory.createEtchedBorder());
        add(etchedBorder);

        JLabel emptyBorder = new JLabel("Empty Border");
        emptyBorder.setBorder(BorderFactory.createEmptyBorder());
        add(emptyBorder);

        JLabel raisedBevelBorder = new JLabel("Raised Bevel Border");
        raisedBevelBorder.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        add(raisedBevelBorder);

        JLabel loweredBevelBorder = new JLabel("Lowered Bevel Border");
        loweredBevelBorder.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        add(loweredBevelBorder);

        JLabel dashedBorder = new JLabel("Dashed Border");
        dashedBorder.setBorder(BorderFactory.createDashedBorder(Color.BLACK, 5, 5));
        add(dashedBorder);

        JLabel titledBorder = new JLabel("Titled Border");
        titledBorder.setBorder(BorderFactory.createTitledBorder("Border"));
        add(titledBorder);

        setSize(190,260);
        setVisible(true);
    
    }


    public static void main(String[] args){

        new BorderExample();
    }

}
