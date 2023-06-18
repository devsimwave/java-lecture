package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_MethodTest extends JFrame implements ActionListener {
	
	private JButton button;
	private JLabel label;
	
	public D_MethodTest() {
		this.setTitle("메소드 오버라이딩 테스트");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		
		button.addActionListener(this); 
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new D_MethodTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
	}

}
