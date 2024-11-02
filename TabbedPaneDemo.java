import javax.swing.*;

public class TabbedPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel tab1 = new JPanel();

        tab1.add(new JLabel("label 1"));
        tab1.add(new JButton("press me!"));
        tab1.add(new JLabel("Top-level containers: JFrame, JDialog, JWindow"));
        
        tabbedPane.addTab("First Tab", tab1);

        JPanel tab2 = new JPanel();
        JButton button = new JButton("Button!");
        JSlider slider = new JSlider(0, 100);
        tab2.add(button);
        tab2.add(slider);
        tabbedPane.addTab("Second Tab", tab2);

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("Other containers: JPanel, JScrollPane, JSplitPane"));
        tabbedPane.addTab("Third Tab", tab3);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
