package com.chowx.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameDemo {
	public static void main(String[] args){
		JFrame frame = new JFrame("JFrameDemo");
		JButton button = new JButton("µ„Œ“");
		
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(button,BorderLayout.CENTER);
		frame.setContentPane(contentPane);
		
		frame.setVisible(true);
	}
}
