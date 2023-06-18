package com.greedy.section03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFieldTest {

	public static void main(String[] args) {

		JFrame mf = new JFrame();
		mf.setSize(300, 130);
		mf.setTitle("제곱 계산하기");
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		
		JTextField text = new JTextField(15);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값"));
		
		JTextField result = new JTextField(15);
		result.setEditable(false); 		//내가 직접 입력 불가능하게 만든다.
		panel.add(result);
	
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int value = Integer.parseInt(text.getText());
				
				result.setText(value * value + "");
				
				text.requestFocus(); // 값을 입력하고 나서 커서가 다시 돌아올 수 있게 해준 기능
				
			}
		});
		
		panel.add(btn);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
