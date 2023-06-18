package com.greedy.section03.component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.ByteOrder;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBoxTest {

	public static void main(String[] args) {

		JFrame mf = new JFrame();
		
		String[] fruits = new String[] {"apple", "orange", "banana"};
		JCheckBox[] buttons = new JCheckBox[3];
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel();
		for(int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("선택된 과일이 없습니다.");
		resultPanel.add(text);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int count = 0;
					
					for(int i = 0; i < buttons.length; i++) {
						if(buttons[i].isSelected()) {
							result += buttons[i].getText() + " ";
							count++;
						}
					}
					
					if(count == 0) {
						text.setText("선택된 과일이 없습니다.");
					} else {
						text.setText(result);
					}
					
				
				}
			});
		}
		
		mf.add(checkPanel, BorderLayout.NORTH);
		mf.add(resultPanel, BorderLayout.CENTER);
		
		
		mf.pack(); 	//자동으로 프레임 사이즈를 지정하는 메소드
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
