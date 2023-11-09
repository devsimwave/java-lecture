package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButtonTest {

	public static void main(String[] args) {

		JFrame mf = new JFrame("라디오버튼 테스트");
		mf.setSize(300, 150);
	
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		
		JPanel sizePanel = new JPanel();
		
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("Medium size");
		JRadioButton large = new JRadioButton("Large size");
		
		ButtonGroup size = new ButtonGroup(); //여러개를 중복선택 방지를 해준다.
		size.add(small);
		size.add(medium);
		size.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultPanel.add(text);
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small size가 선택되었습니다.");
			}
		});

		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium size가 선택되었습니다.");
				
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large size가 선택되었습니다.");
				
			}
		});
		
		
		mf.add(topPanel, BorderLayout.NORTH);
		mf.add(sizePanel, BorderLayout.CENTER);
		mf.add(resultPanel, BorderLayout.SOUTH);
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
