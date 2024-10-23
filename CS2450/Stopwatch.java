package CS2450;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;
//THIS CODE IS INCOMPLETE
public class Stopwatch implements ActionListener{
	JLabel jtime; 
	long start; //time in milliseconds
    long stop;
	Stopwatch(){
		//jframe container
		JFrame jfrm = new JFrame("Stopwatch");
		//setLayout
		jfrm.getContentPane().setLayout(new FlowLayout());
		//set size
		jfrm.setSize(300, 100);
		
		//default close operation
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//components - label and 2 buttons
		JButton jstart = new JButton("Start");
		//action listener for jstart
		jstart.addActionListener(this);
		JButton jstop = new JButton ("Stop");
        //action listener for jstop
        jstop.addActionListener(this);
		jtime = new JLabel("Press 'Start' when ready.");
		
		//add components to content pane
		jfrm.getContentPane().add(jstart);
		jfrm.getContentPane().add(jstop);
		jfrm.getContentPane().add(jtime);
		
		//set Visible
		jfrm.setVisible(true);
	}
	//handle action event
	public void actionPerformed(ActionEvent ae) {
		Calendar cal = Calendar.getInstance(); //get current system time
		
		if(ae.getActionCommand().equals("Start")) {
			//store start time
			start = cal.getTimeInMillis();
			jtime.setText("Stopwatch is running...");
		} else if (ae.getActionCommand().equals("Stop")){
            stop = cal.getTimeInMillis()-start;
            jtime.setText("Time: " + stop + " milliseconds");
        }

	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Stopwatch();
			}
		});
	}
}