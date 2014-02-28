package com.chowx.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv,ph;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();

	}
	
	public void go(){
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		
		pv = new JPanel();
		pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
		pv.add(new JLabel("Monday"));
		pv.add(new JLabel("Tuesday")); 		 
		pv.add(new JLabel("Wednesday"));		 
		pv.add(new JLabel("Thursday"));		 
		pv.add(new JLabel("Friday")); 		 
		pv.add(new JLabel("Saturday")); 		 
		pv.add(new JLabel("Sunday")); 	
		
		contentPane.add(pv, BorderLayout.CENTER);
		
		ph = new JPanel();
		ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
		
		ph.add(new JButton("YES"));
		ph.add(new JButton("No"));
		ph.add(new JButton("Cancel"));
		contentPane.add(ph,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

}
