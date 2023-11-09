package com.greedy.section03.component;



import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class H_DialogTest { //조그맣게 창을 띄게 하는거 dialog

	public static void main(String[] args) {

		JFrame mf = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton("Simple Dialog");
		
		
		panel.add(button1);
		
		Dialog sd = new Dialog(mf, "simple");
		sd.setBounds(150, 250, 150, 150);
		sd.add(new JLabel("Simple Dialog Test"));
		
		JButton button2 = new JButton("close");
		sd.add(button2);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				sd.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				sd.dispose();
			}
		});
		
		JButton button3= new JButton("input dialog");
		panel.add(button3);
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog("내용을 입력하세요");
				System.out.println(result);
			}
		});
		
		
		mf.add(panel);
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
