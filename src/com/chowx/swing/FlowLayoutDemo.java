package com.chowx.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	private JFrame frame;
	private JButton btn1,btn2,btn3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlowLayoutDemo that = new FlowLayoutDemo();
		that.go();
	}
	
	public void go(){
		frame = new JFrame("Flow Layout");
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER,15,15);
		
		
		contentPane.setLayout(layout);

		btn1 = new JButton("OK");
		btn2 = new JButton("Open");
		btn3 = new JButton("Close");
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		
		frame.setSize(500,300);
		frame.setVisible(true);
	}

}
