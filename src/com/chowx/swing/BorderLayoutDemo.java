package com.chowx.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
	private JFrame frame;
	private JButton be,bw,bn,bs,bc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BorderLayoutDemo that = new BorderLayoutDemo();
		that.go();
	}
	
	public void go(){
		frame = new JFrame("Border Layout");
		be = new JButton("East");
		bw = new JButton("West");
		bn = new JButton("North");
		bs = new JButton("South");
		bc = new JButton("Center");
		
		Container conentPane = frame.getContentPane();
		conentPane.add(be,"East");
		conentPane.add(bw, BorderLayout.WEST);
		conentPane.add(bn, BorderLayout.NORTH);
		conentPane.add(bs, BorderLayout.SOUTH);
		conentPane.add(bc, BorderLayout.CENTER);
		
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

}
