package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_ImageLabelTest {

	public static void main(String[] args) {

		JFrame mf = new JFrame("이미지 라벨 테스트");
		mf.setSize(250, 300);
		
		
		
		Image icon = new ImageIcon("images/user.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel label = new JLabel(new ImageIcon(icon)); 		//라벨에 문자열도 넣을 수 있고 이미지도 넣을 수 있다.
		
		JButton button = new JButton("이미지 보기");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon("images/dog.PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(icon));
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(label, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);
		
		mf.add(panel);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}
